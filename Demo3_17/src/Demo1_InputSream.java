import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.BinaryOperator;

public class Demo1_InputSream {

	public static void main(String[] args) throws IOException {
		//domo1();
		//demo2();
		FileInputStream file =new FileInputStream("中文.txt");
		int num;
		byte[] arr =new byte[2];
		while((num=file.read(arr))!=-1){
			System.out.print(new String(arr));
			}
	file.close();
			}

	
	private static void demo2() {
		int s ='我';
		System.out.println(s);
		
	
      String     s2 = Integer.toBinaryString('我');
      BigInteger s1 =      new  BigInteger("111111111111111");//读取用int接受防止
                                                         //读到8个1终止程序 所以read返回值int
                     System.out.println(s1.longValue());  
              int  s3 = Integer.valueOf("11000100", 2);
              int  s4 = Integer.valueOf("00010001", 2);

              System.out.println(s2);
              System.out.println(s3);
	}

	private static void domo1() throws IOException, FileNotFoundException {
		File file1 = new File("yecf.txt");
		file1.createNewFile();
		FileInputStream fis = new FileInputStream("yecf.txt");
		int x = fis.read();
		System.out.println(x);
		while((x =fis.read())!=-1){
			System.out.println((char)x);
		}
		fis.close();
	}
}
