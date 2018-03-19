package com.ye.socket2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo_Receive {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(7452);
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		while (true) {
			socket.receive(packet);
			byte[] arr = packet.getData();
			int len = packet.getLength();
			String str =packet.getAddress().getHostAddress();
			int port =packet.getPort();
			System.out.print(str+port+":");
			System.out.println(new String(arr, 0, len));
		}

	}

}
