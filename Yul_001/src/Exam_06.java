import java.io.*;

public class Exam_06 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = 
			new BufferedReader (new InputStreamReader(System.in));
		
		String imsi="";
		int a=0;
		int b=0;
		int c=0;
		int sum=0;
		float avg=0;
		
		System.out.print("���� : ");
		imsi=in.readLine();
		a=Integer.parseInt(imsi);
		
		System.out.print("��� : ");
		imsi=in.readLine();
		b=Integer.parseInt(imsi);
		
		System.out.print("�ڿ� : ");
		imsi=in.readLine();
		c=Integer.parseInt(imsi);
		
		sum=a+b+c;
		avg=(sum/3);
		
		System.out.println();
		System.out.println("������ : " + sum);
		System.out.println("����� : " + avg);

	}

}