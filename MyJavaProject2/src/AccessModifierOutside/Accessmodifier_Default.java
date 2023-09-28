package AccessModifierOutside;

public class Accessmodifier_Default
{
	public static void main(String[] args) 
	{
		int a = 10;
		
		System.out.println(a);
		
		m1();
		//m2();  //default access modifier is only within package  
		         //not accessible outside package 
	}
	
    static void m1()
	{
		System.out.println("hello");
	}
}
