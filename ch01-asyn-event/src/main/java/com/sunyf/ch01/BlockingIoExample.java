package com.sunyf.ch01;

/**
 * @program: netty-in-action
 * @description: 代码清单 1-1 阻塞 I/O 示例
 * @author: Mr.Sun
 * @create: 2018-11-12 20:32
 **/

//io
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//net
import java.net.ServerSocket;
import java.net.Socket;

public class BlockingIoExample {

    public void serve(int portNumber) throws IOException {

        //创建一个新的 ServerSocket，用以监听指定端口上的连接请求
        ServerSocket serverSocket = new ServerSocket(portNumber);

        //对accept()方法的调用将被阻塞，直到一个连接建立
        Socket clientSocket = serverSocket.accept();

        //输入流
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        //输出流
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        //定义字符串变量
        String request, response;

        //处理循环开始
        while ((request = in.readLine()) != null) {
            if ("Done".equals(request)) {
                break;
            }
            //请求被传递给服务器的处理方法
            response = processRequest(request);
            //服务器的响应被发送给了客户端
            out.println(response);
            //继续执行处理循环
        }
    }

    //请求被传递给服务器的处理方法
    private String processRequest(String request){
        return "Processed";
    }
}
