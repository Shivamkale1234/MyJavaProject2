package LogicalProgram1;

public class HarshadNumber 
{
	public static void main(String[] args) 
	{
		int num = 171;
		int temp=num;
		int sum = 0;		

		while(num>0)
		{
			int rem = num%10;
		    sum = sum+rem;
			num = num/10;
		}
		System.out.println(sum);

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
