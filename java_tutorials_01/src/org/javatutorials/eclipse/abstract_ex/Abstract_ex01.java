package org.javatutorials.eclipse.abstract_ex;

abstract class A{
    public abstract int b();
    //��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
    //public abstract int c(){System.out.println("Hello")}
    //�߻� Ŭ���� ������ �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ���� �� �� �ִ�. 
    public void d(){
        System.out.println("world");
    }
}

class B extends A{
    public int b(){
    	return 1;
    }
}

public class Abstract_ex01{
    
	public static void main(String[] args) {
        B obj = new B();
        obj.d();
    }
}