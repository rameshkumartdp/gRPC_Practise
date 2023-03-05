### Building and Running each module

Go to ``/gRPC_Practise/`` project root directory location and execute the following commands,

#### Build commands

|            module             |                             build server                              |               build client                |
|:-----------------------------:|:---------------------------------------------------------------------:|:-----------------------------------------:|
|           1_sample            |           ```./gradlew :_modules:1_sample:server:build ```            | ```./gradlew :_modules:1_sample:client:build``` |
|          2_grpctypes          |          ```./gradlew :_modules:2_grpctypes:server:build ```          | ```./gradlew :_modules:2_grpctypes:client:build``` |
|          3_deadlines          |          ```./gradlew :_modules:3_deadlines:server:build ```          | ```./gradlew :_modules:3_deadlines:client:build``` |
|        4_cancellation         |        ```./gradlew :_modules:4_cancellation:server:build ```         | ```./gradlew :_modules:4_cancellation:client:build``` |
|         5_compression         |         ```./gradlew :_modules:5_compression:server:build ```         | ```./gradlew :_modules:5_compression:client:build``` |
|        6_interceptors         |        ```./gradlew :_modules:6_interceptors:server:build ```         | ```./gradlew :_modules:6_interceptors:client:build``` |
|          7_metadata           |          ```./gradlew :_modules:7_metadata:server:build ```           | ```./gradlew :_modules:7_metadata:client:build``` |
|        8_multiplexing         |        ```./gradlew :_modules:8_multiplexing:server:build ```         | ```./gradlew :_modules:8_multiplexing:client:build``` |
|       9_error-handling        |       ```./gradlew :_modules:9_error-handling:server:build ```        | ```./gradlew :_modules:9_error-handling:client:build``` |
|         10_keepalive          |         ```./gradlew :_modules:10_keepalive:server:build ```          | ```./gradlew :_modules:10_keepalive:client:build``` |
|    11_basic-authentication    |    ```./gradlew :_modules:11_basic-authentication:server:build ```    | ```./gradlew :_modules:11_basic-authentication:client:build``` |
| 12_token-based-authentication | ```./gradlew :_modules:12_token-based-authentication:server:build ``` | ```./gradlew :_modules:12_token-based-authentication:client:build``` |
|       13_secure-channel       |       ```./gradlew :_modules:13_secure-channel:server:build ```       | ```./gradlew :_modules:13_secure-channel:client:build``` |
|     14_mutual-tls-channel     |     ```./gradlew :_modules:14_mutual-tls-channel:server:build ```     | ```./gradlew :_modules:14_mutual-tls-channel:client:build``` |
|       15_grpc-unittest        |        ```./gradlew :_modules:15_grpc-unittest:java:build ```         | |
|       16-grpc-opencesus       |       ```./gradlew :_modules:16-grpc-opencesus:server:build ```       | ```./gradlew :_modules:16-grpc-opencesus:client:build``` |
|   17-grpc-opencesus-tracing   |   ```./gradlew :_modules:17-grpc-opencesus-tracing:server:build ```   | ```./gradlew :_modules:17-grpc-opencesus-tracing:client:build``` |
|     18_server-reflection      |   ```./gradlew :_modules:18_server-reflection:java:server:build ```   |  |


#### Run commands

|            module             |                                           run server                                            |                              run client                              |
|:-----------------------------:|:-----------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------:|
|           1_sample            |                 ```java -jar _modules/1_sample/server/build/libs/server.jar ```                 |           ```java -jar _modules/1_sample/client/build/libs/client.jar ```            |
|          2_grpctypes          |               ```java -jar _modules/2_grpctypes/server/build/libs/server.jar ```                |          ```java -jar _modules/2_grpctypes/client/build/libs/client.jar ```         |
|          3_deadlines          |                       ```java -jar _modules/3_deadlines/server/build/libs/server.jar ```                        |          ```java -jar _modules/3_deadlines/client/build/libs/client.jar ```          |
|        4_cancellation         |                     ```java -jar _modules/4_cancellation/server/build/libs/server.jar ```                       |        ```java -jar _modules/4_cancellation/client/build/libs/client.jar ```          |
|         5_compression         |                      ```java -jar _modules/5_compression/server/build/libs/server.jar ```                       |         ```java -jar _modules/5_compression/client/build/libs/client.jar ```         |
|        6_interceptors         |                     ```java -jar _modules/6_interceptors/server/build/libs/server.jar ```                      |        ```java -jar _modules/6_interceptors/client/build/libs/client.jar ```          |
|          7_metadata           |                       ```java -jar _modules/7_metadata/server/build/libs/server.jar ```                         |          ```java -jar _modules/7_metadata/client/build/libs/client.jar ```            |
|        8_multiplexing         |                     ```java -jar _modules/8_multiplexing/server/build/libs/server.jar ```                     |        ```java -jar _modules/8_multiplexing/client/build/libs/client.jar ```         |
|       9_error-handling        |                    ```java -jar _modules/9_error-handling/server/build/libs/server.jar ```                    |       ```java -jar _modules/9_error-handling/client/build/libs/client.jar ```        |
|         10_keepalive          |                      ```java -jar _modules/10_keepalive/server/build/libs/server.jar ```                        |         ```java -jar _modules/10_keepalive/client/build/libs/client.jar ```          |
|    11_basic-authentication    |                 ```java -jar _modules/11_basic-authentication/server/build/libs/server.jar ```                |    ```java -jar _modules/11_basic-authentication/client/build/libs/client.jar ```    |
| 12_token-based-authentication |              ```java -jar _modules/12_token-based-authentication/server/build/libs/server.jar ```               | ```java -jar _modules/12_token-based-authentication/client/build/libs/client.jar ``` |
|       13_secure-channel       |                    ```java -jar _modules/13_secure-channel/server/build/libs/server.jar ```                    |       ```java -jar _modules/13_secure-channel/client/build/libs/client.jar ```       |
|     14_mutual-tls-channel     |                  ```java -jar _modules/14_mutual-tls-channel/server/build/libs/server.jar ```                  |     ```java -jar _modules/14_mutual-tls-channel/client/build/libs/client.jar ```    |
|       15_grpc-unittest        |                     ```java -jar _modules/15_grpc-unittest/java/build/libs/java.jar ```                       |                                                                      |
|       16-grpc-opencesus       |                    ```java -jar _modules/16_grpc-opencensus/server/build/libs/server.jar ```                   |       ```java -jar _modules/16_grpc-opencensus/client/build/libs/client.jar ```     |
|   17-grpc-opencesus-tracing   |                ```java -jar _modules/17_grpc-opencensus-tracing/server/build/libs/server.jar ```                |   ```java -jar _modules/17_grpc-opencensus-tracing/client/build/libs/client.jar ```   |
|     18_server-reflection      |                ```java -jar _modules/18_server-reflection/java/server/build/libs/server.jar ```                |                                                                      |

