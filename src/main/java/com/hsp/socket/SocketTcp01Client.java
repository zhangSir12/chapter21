package com.hsp.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTcp01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket = " + socket.getClass());
        OutputStream ops = socket.getOutputStream();
        ops.write("Hello Server".getBytes());
        ops.close();
        socket.close();
        System.out.println("客户端写入完毕");
    }
}
