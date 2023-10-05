package LogicalProgram1;

public class ReverseNumber 
{
	public static void main(String[] args)   
	{   
		int number = 123456; 
		int reverse = 0;  
		
		for(;number!=0;)   
		{  
			int rem = number % 10;  
			reverse = reverse * 10 + rem;
			number= number / 10;
		}  
		System.out.println("The reverse number is: " + reverse); 
	}  

}
