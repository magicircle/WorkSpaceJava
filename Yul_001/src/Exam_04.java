import java.io.*;

public class Exam_04 {
	public static void main(String[] ar) throws IOException{
		System.out.print("Ű���� �ϳ��� �������� : ");
		// int a = System.in.read();
		char a =(char)System.in.read();
		System.out.println("a = " + a);
		
		System.in.read(); // \r
		System.in.read(); // \n
		
		System.out.print("���� �ϳ� �������� : ");
		int b = System.in.read() - '0';
		System.out.println("b = " + b);
		
		System.in.read(); // \r
		System.in.read(); // \n
		
		byte[] by = new byte[10];
		System.out.print("���� = ");
		System.in.read(by);
		System.out.println("��� = " + new String(by));
		
		
	}
}