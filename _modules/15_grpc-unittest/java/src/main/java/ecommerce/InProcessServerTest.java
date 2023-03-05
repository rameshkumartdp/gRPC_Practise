package ecommerce;

import com.google.protobuf.StringValue;
import io.grpc.ManagedChannel;
import static org.junit.jupiter.api.Assertions.*;

import io.grpc.StatusRuntimeException;
import io.grpc.inprocess.InProcessChannelBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InProcessServerTest {
    private static final Logger logger = Logger.getLogger(InProcessServerTest.class.getName());

    private OrderMgtServer<OrderMgtServiceImpl> inprocessServer;
    private ManagedChannel channel;
    private OrderManagementGrpc.OrderManagementBlockingStub blockingStub;
    private OrderManagementGrpc.OrderManagementStub asyncStub;

    public InProcessServerTest() {
        super();
    }

    @BeforeEach
    public void beforeEachTest() throws InstantiationException, IllegalAccessException, IOException {
        inprocessServer = new OrderMgtServer<>(OrderMgtServiceImpl.class);
        inprocessServer.start();
        channel = InProcessChannelBuilder
                .forName("test")
                .directExecutor()
                .usePlaintext()
                .build();
        blockingStub = OrderManagementGrpc.newBlockingStub(channel);
        asyncStub = OrderManagementGrpc.newStub(channel);
    }

    @AfterEach
    public void afterEachTest(){
        channel.shutdownNow();
        inprocessServer.stop();
    }

    @Test
    public void testInProcessServer() throws InterruptedException{
        try {
            String orderId = getOrderId();
            assertEquals("102", orderId);
        } finally {
            shutdown();
        }
    }

    public String getOrderId() {
        logger.info("Will try to get Order ID ...");
        StringValue id = StringValue.newBuilder().setValue("102").build();
        OrderManagementOuterClass.Order response;
        try {
            response = blockingStub.getOrder(id);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            e.printStackTrace();
            fail();
            return "";
        }
        return response.getId();
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
}
