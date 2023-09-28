package Loops;

public class While_Loop_HarshadNumber {

	public static void main(String[] args) {

		int num = 171;
		int temp=num;
		int sum = 0;		

		while(num>0)
		{
			int rem = num%10;
		    sum = sum+rem;
			num = num/10;
		}

		if(temp%sum==0)
		{
			System.out.println("Harshad Number");
		}
		else
		{
			System.out.println("Not Harshad Number");
		}
	}

}
