package starPrograms;

public class StarProgramA4_Incr_DecrBy1
{
	public static void main(String[] args) 
	{
		
		int end=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=end; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			end++;
		}
		
		int end1=4;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=end1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			end1--;
		}
		
	}
}
