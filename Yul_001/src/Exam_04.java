import java.io.*;

public class Exam_04 {
	public static void main(String[] ar) throws IOException{
		System.out.print("키보드 하나를 누르세요 : ");
		// int a = System.in.read();
		char a =(char)System.in.read();
		System.out.println("a = " + a);
		
		System.in.read(); // \r
		System.in.read(); // \n
		
		System.out.print("수를 하나 누르세요 : ");
		int b = System.in.read() - '0';
		System.out.println("b = " + b);
		
		System.in.read(); // \r
		System.in.read(); // \n
		
		byte[] by = new byte[10];
		System.out.print("과목 = ");
		System.in.read(by);
		System.out.println("결과 = " + new String(by));
		
		
	}
}
