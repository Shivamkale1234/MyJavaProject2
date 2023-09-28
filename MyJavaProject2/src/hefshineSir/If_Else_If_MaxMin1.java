package hefshineSir;
public class If_Else_If_MaxMin1
{
	public static void main(String [] args )
	{
		int num1=123;
		int num2=127;
		int num3=123;
		
		if (num1>num2 && num1>num3)
		{
		System.out.println("num1 is maximum");
		}
		else if (num1<num2 && num1<num3)
		{
		System.out.println("num1 is minimum");
		}
		else if (num2>num1 && num2>num3)
		{
		System.out.println("num2 is maximum");
		}
		else if (num2<num1 && num2<num3)
		{
		System.out.println("num2 is minimum");
		}
		else 
		{
		System.out.println("all numbers are same");
		}
		
		 
		
}}
