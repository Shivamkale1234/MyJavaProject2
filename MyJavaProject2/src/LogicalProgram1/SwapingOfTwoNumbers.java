package LogicalProgram1;

public class SwapingOfTwoNumbers 
{
	public static void main(String[] args)
	{	 
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("before swap");
		System.out.println(num1);
		System.out.println(num2);
		
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("after swap");
		System.out.println(num1);
		System.out.println(num2);
	}
}