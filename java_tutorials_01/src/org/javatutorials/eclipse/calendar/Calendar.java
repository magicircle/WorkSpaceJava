// ���� �޷� ���α׷�

package org.javatutorials.eclipse.calendar;

class Cal_day{
 
	//�ش� �⵵,��,�ش� ���� �� ��,1���� ������ �޾� �� ���� �޷� ���
	public static void printout_month(int week_1, int month_i, int months, int year){
		System.out.printf("        %4s��  %2s��\n",year,month_i);
		for(int i=0;i<7;i++){
			String[] week_c = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
			System.out.printf("%3s ",week_c[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<week_1;i++){
			System.out.printf("    ");
		}
		
		for(int i=1;i<=months;i++){
			System.out.printf("%3d ",i);
			week_1=week_1+1;
			if (week_1==7){
				week_1=0;
				System.out.println();
			}
		}		
	}
	
	// �ش� �⵵�� ������ �ִ°�
	public static int month_yun(int year){
		int month_2=28;
		if(year%4 == 0) month_2=29; 
		if(year%100 == 0) month_2=28; 
		if(year%400 == 0) month_2=29; 
		
		return month_2;
	}
	
	//�ش� �⵵�� 1��1���� ���� �����ΰ�
	public static int week_0(int year){
		int year_o= 1583;
		int yun_o = (int)(1582/4) - (int)(1582/100) + (int)(1582/400); // 1582������
		int ty = year - 1;
		int yun_i = (int)(ty/4) - (int)(ty/100) + (int)(ty/400); // year_i���� ������
		int yun_s = yun_i - yun_o; // 1583����� year_i����� ���� ��
		int year_tm = year - year_o; // 1583�����κ��� ����� �����ΰ�
		int pyung_s = year_tm - yun_s; // 1583����� year_i����� ��� ��
		int week_0 = (6 + (yun_s*2 + pyung_s)%7)%7;
		
		return week_0;
		
	}
	
}


public class Calendar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] month_c = {31,28,31,30,31,30,31,31,30,31,30,31};
		int month_s=0;
		int week_0=6,week_m=0; // week_0, 1583��1��1���� �����
		int year_i=2016;  // ���ϴ� �⵵ �Է� 1583 ���� ū ��
		int month_i=5;    // ���ϴ� �� �Է�

		month_c[1] = Cal_day.month_yun(year_i);
		week_0 = Cal_day.week_0(year_i);
		for(int i=0;i<(month_i-1);i++) month_s = month_s + month_c[i];
		week_m = (week_0 + month_s%7)%7; 
				
		Cal_day.printout_month(week_m,month_i,month_c[month_i-1],year_i);
		
		
	}

}