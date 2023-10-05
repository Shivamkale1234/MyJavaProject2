package typesOfVeriables;

public class Sample2 
{
	static int a = 10;    
	
	public void m1()
	{
		System.out.println(a);
	}
	
	public static void m2()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		 
		// static globle variable call from same class
		System.out.println(a);
		
		// static globle variable call from diff class
		System.out.println(Sample3.c);
	
		// method call from same class
        Sample2 s2 = new Sample2();
        s2.m1();
        m2();
	}
}
