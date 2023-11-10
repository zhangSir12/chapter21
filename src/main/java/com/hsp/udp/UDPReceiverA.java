package com.hsp.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(9999);
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
            datagramSocket.receive(datagramPacket);
            int length = datagramPacket.getLength();
            byte[] data = datagramPacket.getData();
            String s = new String(data, 0, data.length);
            System.out.println("接收到的数据为：" + s);
            datagramSocket.close();
            System.out.println("A端退出");
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
