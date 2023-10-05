package LogicalProgram1;

public class Display_even_odd_Numbers 
{

	public static void main(String[] args) 
	{
		
		int start =1;
		int end =50;
		
		System.out.println("print even numbers");
		for(int i=start; i<=end; i++)
		{
			if(i%2==0)
			System.out.println(i);
		}
		System.out.println("---------------------");
		System.out.println("print odd number");
		
		for(int j=start; j<=end; j++)
		{
			if(j%2!=0)
			System.out.println(j);
		}
		
		
	}

}
