package hefshineSir;
public class If_Else_If_MethCal
{
	public static void main(String[] args) {
		int num1=12;
		int num2=33;
		char operator='+';
		
		if (operator=='+')
		{
		System.out.println(num1+num2);
		}
		else if (operator=='-')
		{
		System.out.println(num1-num2);
		}
		else if (operator=='*')
		{
		System.out.println(num1*num2);
		}
		else if (operator=='/')
		{
		System.out.println(num1/num2);
		}
		else 
		{
		System.out.println("enter valid operator");
		}
	}
}
