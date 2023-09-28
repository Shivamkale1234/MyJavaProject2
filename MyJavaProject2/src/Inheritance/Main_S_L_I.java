package Inheritance;

class A 
{
	void m1() 
	{
		System.out.println("method from class A");
	}
}

public class Main_S_L_I extends A
{
	 static void m2() 
	 {
		System.out.println("method from class B");
	 }
	 
	 public static void main(String[] args) 
	 {
		 Main_S_L_I ob = new Main_S_L_I();
		 ob.m1();
		 m2();
	 }
}
