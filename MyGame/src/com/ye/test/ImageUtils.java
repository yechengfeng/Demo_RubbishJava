package com.ye.test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageUtils {
	public static Image getImage(String path){
		URL u = ImageUtils.class.getClassLoader().getResource(path);
		BufferedImage image =null;
		try {
			image=ImageIO.read(u);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return image;
	} 
}
