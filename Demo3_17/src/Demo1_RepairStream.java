import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_RepairStream {
	public static void main(String[] args) throws IOException {
		 demo1();
		  //֮ǰ��bug��һ��ѭ����ʹ��������file.read(); ��ȡʱ�����Ŷ�ȡ��!!!!fuck!!!!
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
		System.out.println("Demo1�������");

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
		System.out.println("�������");
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
		System.out.println("�������");

		fos.close();
		file.close();
	}
}
