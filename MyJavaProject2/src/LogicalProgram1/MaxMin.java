package LogicalProgram1;
public class MaxMin
{
	public static void main(String [] args )
	{
		int num1=32;
		int num2=21;
		int num3=23;
		
		if (num1>num2 && num1>num3)
		{
		System.out.println("num1 is max");
		}
		else if (num2>num1 && num2>num3)
		{
		System.out.println("num2 is max");
		}
		else 
		{
		System.out.println("num2 is max");
		}
		
		if (num1<num2 && num1<num3)
		{
		System.out.println("num1 is min");
		}
		else if (num2<num1 && num2<num3)
		{
		System.out.println("num2 is min");
		}
		else 
		{
		System.out.println("num2 is min");
		}

}}
