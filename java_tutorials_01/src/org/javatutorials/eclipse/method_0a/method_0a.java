package org.javatutorials.eclipse.method_0a;

public class method_0a {
	public static void days(int daylimit){
		int i=1;
		while(i<=daylimit){
			System.out.println(i+"  ");
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		days(30);
		System.out.println(args.length);
		for(String ea : args){
			System.out.println(ea);
		}
		
	}

}