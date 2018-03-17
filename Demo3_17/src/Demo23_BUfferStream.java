import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo23_BUfferStream {

	public static void main(String[] args) throws IOException {
BufferedInputStream  bis =new BufferedInputStream(new FileInputStream("AJ.mp3"));
BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.mp3"));
   int num;
   while((num=bis.read())!=-1){
	   bos.write(num);
   }
   System.out.println("copyÍê³É");
   bis.close();
   bos.close();
	}

}
