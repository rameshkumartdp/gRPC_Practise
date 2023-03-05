package ecommerce;

import io.grpc.Server;
import io.grpc.inprocess.InProcessServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class OrderMgtServer<T extends io.grpc.BindableService> {
    private static final Logger logger = Logger.getLogger(OrderMgtServer.class.getName());

    private Server server;

    private Class<T> clazz;

    public OrderMgtServer(Class<T> clazz){
        this.clazz = clazz;
    }

    public void start() throws IOException, InstantiationException, IllegalAccessException {
        server = InProcessServerBuilder
                .forName("test")
                .directExecutor()
                .addService(clazz.newInstance())
                .build()
                .start();
        logger.info("Server started, listening on " + server.getPort());
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            logger.info("*** shutting down gRPC server since JVM is shutting down");
            OrderMgtServer.this.stop();
            logger.info("*** server shut down");
        }));
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException, InstantiationException, IllegalAccessException {
        final OrderMgtServer server = new OrderMgtServer(OrderMgtServer.class);
        server.start();
        server.blockUntilShutdown();
    }

}
