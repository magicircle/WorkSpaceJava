package org.javatutorials.eclipse.array_ex01;

public class array_ex01 {

	public static void main(String[] args) {
		// �迭
		String[] weeks = {"��","ȭ","��","��","��","��","��"};
		
		for(String we : weeks){
			System.out.printf("%s���� %d\n",we,weeks.length);
		}
		
	}

}