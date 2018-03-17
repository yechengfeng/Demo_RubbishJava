import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_Stream {
	public static void main(String[] args) throws IOException {
		//demo1();  // copy 了一半？
	   demo2();	//完全copy
		//demo3();   //完全copy
       //demo4();  // 拷贝一半？    

	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream file = new FileInputStream("1.jpg");
			FileOutputStream fos = new FileOutputStream("copy1.jpg");
			int i = 1;

			while (i <=file.available()) {
				fos.write(file.read());
				System.out.println(i++);
			}
			System.out.println("拷贝完成");

			fos.close();
			file.close();
	}

	private static void demo2() throws FileNotFoundException, IOException {

		FileInputStream file = new FileInputStream("1.jpg");
		FileOutputStream fos = new FileOutputStream("copy2.jpg");
		int i = 1;
		  int num =file.available();

		while (i <=num) {
			fos.write(file.read());
			System.out.println(i++);
		}
		System.out.println("拷贝完成");

		fos.close();
		file.close();
	}

	private static void demo3() throws FileNotFoundException, IOException {

		FileInputStream file = new FileInputStream("1.jpg");
		FileOutputStream fos = new FileOutputStream("copy3.jpg");
		byte[] arr = new byte[file.available()];
		int num =file.available();
		System.out.println(num);
		file.read(arr);
		fos.write(arr);
		System.out.println("拷贝完成");
	/*	for (byte b : arr) {
			System.out.println(b);
		}*/
		for(int a=0;a<num;a++){
			System.out.println(a);
			System.out.println(arr[a]);
		}
		
		
		file.close();
		fos.close();
	
	}

	private static void demo4() throws FileNotFoundException, IOException {
		FileInputStream file = new FileInputStream("1.jpg");
		FileOutputStream fos = new FileOutputStream("copy4.jpg");
		int i = 1;
		while (file.read() != -1) {
			fos.write(file.read());
			System.out.println(i++);
		}
		System.out.println("拷贝完成");// 为什么只能考一半？

		fos.close();
		file.close();
	}
}
