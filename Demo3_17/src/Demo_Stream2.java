import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_Stream2 {

	public static void main(String[] args) throws IOException {
		FileInputStream  file =new FileInputStream("AJ.mp3");
		FileOutputStream fos =new FileOutputStream("Ac.mp3");
		byte[] arr =new byte[1024*8];
		int len;
		while((len=file.read(arr))!=-1){ //һ�ζ�ȡarr.length�����ݵ�������,����
			fos.write(arr);                 //������һ���ܶ�ȡ������ַ�����
			System.out.println(len);
		}
		System.out.println("�������");
		for (byte b : arr) {
			System.out.println(b);
		}
		file.close();
		fos.close();
	}

}
