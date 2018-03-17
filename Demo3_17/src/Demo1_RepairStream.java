import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_RepairStream {
	public static void main(String[] args) throws IOException {
		 demo1();
		  //之前的bug是一次循环中使用了俩次file.read(); 读取时是跳着读取的!!!!fuck!!!!
		 demo3();
		demo4();

	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream file = new FileInputStream("1.jpg");
		FileOutputStream fos = new FileOutputStream("copy1.jpg");
		int i = 0;
		int num =file.available();
		while (i <= num) {
			fos.write(file.read());
			i++;
		}
		System.out.println("Demo1拷贝完成");

		fos.close();
		file.close();
	}

	

	private static void demo3() throws FileNotFoundException, IOException {

		FileInputStream file = new FileInputStream("1.jpg");
		FileOutputStream fos = new FileOutputStream("copy3.jpg");
		byte[] arr = new byte[file.available()];
		int num = file.available();
		file.read(arr);
		fos.write(arr);
		System.out.println("拷贝完成");
		file.close();
		fos.close();
	}



	private static void demo4() throws FileNotFoundException, IOException {
		FileInputStream file = new FileInputStream("1.jpg");
		FileOutputStream fos = new FileOutputStream("copy4.jpg");
		int i = 1;
		int num;
		while ((num = file.read()) != -1) {
			fos.write(num);
		}
		System.out.println("拷贝完成");

		fos.close();
		file.close();
	}
}
