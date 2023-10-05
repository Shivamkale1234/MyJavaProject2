package typesOfVeriables;

public class Sample4 
{
	int a = 100;
	
	public static void m1()
	{
		Sample4 s4 = new Sample4();
		System.out.println(s4.a);
	}
	
	public void m2()
	{
		System.out.println(a);
	}
	           
	public static void main(String[] args) {
		 
		// non-static globle variable call from same class
		Sample4 s4 = new Sample4();
		System.out.println(s4.a);
		// method call from same class
		m1();
        s4.m2();
		// non-static globle variable call from diff class
		System.out.println(Sample5.d);
	}
}
