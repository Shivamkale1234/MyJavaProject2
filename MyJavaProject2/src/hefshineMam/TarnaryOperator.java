package hefshineMam;

public class TarnaryOperator {

	public static void main(String[] args) {


		int num1 = 10;
		int num2 = 20;
		
		if(num1>num2)
		{
			System.out.println(num1+" is greater");
		}
		else
		{
			System.out.println(num2+" is greater");
		}
		
		int result = (num1<num2) ? num1 : num2; 
		System.out.println(result + " is greater");

	}

}
