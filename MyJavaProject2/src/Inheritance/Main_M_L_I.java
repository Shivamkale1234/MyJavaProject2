package Inheritance;

class one 
{
	void m1() 
	{
		System.out.println("method calling from class one");
	}
}

class two extends one
{
	void m2() 
	{
		System.out.println("method calling from class two");
	}
}

class three extends two
{
	void m3() 
	{
		System.out.println("method calling from class three");
	}
}

public class Main_M_L_I extends three
{
	 static void m4() 
	 {
		System.out.println("method calling from class main");
	 }
	 
	 void m5() 
	 {
		System.out.println("method calling from class main");
	 }
	 
	 public static void main(String[] args) 
	 {
		 Main_M_L_I ob = new Main_M_L_I();
		 ob.m1();
		 ob.m2();
		 ob.m3();
		 m4();
		 ob.m5();
	 }
}
