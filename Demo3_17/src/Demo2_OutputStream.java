import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_OutputStream {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileOutputStream ost = new FileOutputStream("yecf.txt",true);
		
	for(int i=0 ;i<100;i++)
		ost.write(i);
	    ost.close();
	}

}
