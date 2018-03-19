package com.ye.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo1_Gui {

	public static void main(String[] args) {
		Frame f =new Frame();
		f.setVisible(true);
		f.setSize(200, 300);
		f.setLocation(500,500);
		 Button button = new Button("µ„Œ“");
		 f.add(button);
		 f.setLayout(new FlowLayout());
		 button.addMouseListener(new MouseAdapter() {
			 @Override
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
			}
		});
		f.addWindowListener(new WindowAdapter() {@Override
		public void windowClosing(WindowEvent e) {
			
			System.exit(0);
		}
		});
		f.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(e.getKeyCode());
				if(e.getKeyCode()==KeyEvent.VK_SPACE){
				System.exit(0);
			}}
		});
		
}
}