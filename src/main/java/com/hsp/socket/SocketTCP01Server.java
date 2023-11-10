package com.hsp.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端监听9999端口，等待连接。。。");
        Socket socket = serverSocket.accept();

        System.out.println("socket服务端连接成功Socket=" + socket.getClass());
        InputStream is = socket.getInputStream();

        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = is.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }
        is.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端读取完毕" +
                "");
    }
}
