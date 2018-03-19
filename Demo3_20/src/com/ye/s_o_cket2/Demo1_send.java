package com.ye.socket2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Demo1_send {
	public static void main(String[] args) throws Exception {
		Scanner sc =new Scanner(System.in);
		DatagramSocket socket =new DatagramSocket();
		while(true){
			String  str =sc.nextLine();
			if("quit".equals(str)){
				break;
			}else{
			DatagramPacket packet =
		new DatagramPacket(str.getBytes(), str.getBytes().length,InetAddress.getByName("127.0.0.01"),7452 );
				socket.send(packet);}
		}
		
	     socket.close();
	}

}	
