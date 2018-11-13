/**
 * server端
 *
 * 代码清单 2-1 EchoServerHandler {@link nia.chapter2.echoserver.EchoServerHandler}
 *
 * 代码清单 2-2 EchoServer 类 {@link nia.chapter2.echoserver.EchoServer}
 *
 * 代码清单 2-3 客户端的 ChannelHandler {@link nia.chapter2.echoclient.EchoClientHandler}
 *
 * 代码清单 2-4 客户端的主类 {@link nia.chapter2.echoclient.EchoClient}
*/

运行步骤
1、先打包
在ch02-client-server目录下，mvn clean package

2、启动服务端
在server目录下，mvn exec:java

3、启动客户端
在client目录下，mvn exec:java

4、执行结果
Server received: Netty rocks!
Client received: Netty rocks!



