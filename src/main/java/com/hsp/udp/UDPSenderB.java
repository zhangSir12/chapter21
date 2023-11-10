package com.hsp.udp;

import java.io.IOException;
import java.net.*;

public class UDPSenderB {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(9998);
            byte[] data = "hello 明天吃火锅".getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.31.234"), 9999);
            datagramSocket.send(datagramPacket);

            // 关闭资源
            datagramSocket.close();
            System.out.println("B端退出");
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
