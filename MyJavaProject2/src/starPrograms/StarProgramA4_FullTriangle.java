package starPrograms;

public class StarProgramA4_FullTriangle
{
	public static void main(String[] args) 
	{
		int start=1;
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= start; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			start++;
			
		}
		
		int end=4;
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= end; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			end--;
		}
		
	}
}
