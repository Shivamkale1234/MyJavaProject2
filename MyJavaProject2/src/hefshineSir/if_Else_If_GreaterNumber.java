package hefshineSir;

public class if_Else_If_GreaterNumber {

	public static void main(String[] args) {
		 
		
		int num1 = 123;
		int num2 = 245;
		int num3 = 654;
		
		if((num1>num2) && (num1>num3))
		{
			System.out.println("num1 is greater : "+num1);
		}
		else if((num2>num1) && (num2>num3))
		{	
			System.out.println("num2 is greater : "+num2);
		}
		else
		{
			System.out.println("num3 is greater : "+num3);
		}
	}

}
