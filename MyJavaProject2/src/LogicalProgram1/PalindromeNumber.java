package LogicalProgram1;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int num = 12521;
		int temp=num;
		int revnum=0;
		
		while(num>0) 
		{
			int rem = num%10;
			revnum = (revnum*10)+rem;
			num=num/10;
		}
		
		if(revnum==temp)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome number");
		}
	}
}
