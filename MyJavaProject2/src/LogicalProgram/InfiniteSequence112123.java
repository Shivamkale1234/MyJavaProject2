package LogicalProgram;

public class InfiniteSequence112123 
{
	public static void main(String[] args) 
	{
		int count=0;
		int n=3;
		
		first:for (int  i= 1;  ; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				count++;
				if (n==count) 
				{
					System.out.println(j);	
					break first;
				}
			}
		}
	}
}
