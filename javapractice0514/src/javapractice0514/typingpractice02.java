package javapractice0514;

import java.io.*;

public class typingpractice02 {

	public static void main(String[] args) throws IOException {
		InputStreamReader myStream = new InputStreamReader(System.in);
		BufferedReader mrKeyboard = new BufferedReader(myStream);

		File myFile = new File("typing01.txt");
		FileReader mfRead = new FileReader(myFile);
		BufferedReader mrFile = new BufferedReader(mfRead);
		
		String[] readedString = new String[128];
		
		String typingdString;
		int nLine = 0;
		int cCount =0;
		int rRand = 0;
		
		while(true){
			readedString[nLine] = mrFile.readLine();
			if (readedString[nLine]==null) break; 
//			System.out.println(readedString[nLine]);
			nLine++;
		}
		mrFile.close();
		
		// Ÿ���� �Է°� �˻����
		for(int i=0; i<5 ; i++){
			rRand = (int) (Math.random() * nLine);
			System.out.print((i+1)+" : ");
			System.out.println(readedString[rRand]);  // �����ε��� ���� ���
		
			// �ε����� ������ �˻�
			typingdString = mrKeyboard.readLine(); // Ű���� �Է�
			
			for (int j=0 ; j<readedString[rRand].length() ; j++){
				if (j>=typingdString.length()){
					System.out.print("^");
					continue;
				}
				if(typingdString.charAt(j)!=readedString[rRand].charAt(j)){
					System.out.print("^");
					continue;
				}
				System.out.print(".");
				cCount++;
			}
			System.out.println("�ٸ� ���ڼ� :"+ cCount);
			cCount=0;
		}

	}
}