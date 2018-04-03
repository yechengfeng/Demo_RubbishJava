package com.ye.test;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	private int  x=100;
	private int  y=100;
	boolean left,down;
	Image image = ImageUtils.getImage("image/sh2.png");
	public void loadFrame(){
		setSize(500,500);
		setLocation(100, 200);
		setVisible(true);
		new PaintThread().start();
		new PaintThread().start();
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				
			System.exit(0);
			}
		
		});
	
	}
	


	
	@Override
	public void paint(Graphics g) {
		
	
	g.drawImage(image, x, y,null );
	if(left){
		x-=3;
		}else {x+=3;}
	if(x<10){
		left=false;
	}
	if(x>500-30){
		left=true;
	}if(down){
		y+=3;
		}else {y-=3;}
	if(y>500-30){
		down=false;
	}if(y<30){
		down=true;
	}
			
	
	}
	class PaintThread extends Thread{

		@Override
		public void run() {
			
			while(true){
				repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}



	public static void main(String[] args) {
		MyFrame frame =new  MyFrame();
		frame.loadFrame();
		
		


	}
	
}
