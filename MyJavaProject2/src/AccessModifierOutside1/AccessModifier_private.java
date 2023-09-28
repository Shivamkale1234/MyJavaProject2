package AccessModifierOutside1;
public class AccessModifier_private
{
	public static void main(String[] args) 
	{
		int a = 10;
		
		System.out.println(a);
		
		m1();
//private access modifier is only within class can 
//not accessible outside class
		
	}
	
    private static void m1()
	{
		System.out.println("hello");
	}
}
