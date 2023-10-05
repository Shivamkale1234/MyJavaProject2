package starPrograms;

public class StarProgramA2_HalfTriangle
{
	public static void main(String[] args) 
	{
		int end=1;
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= end; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			end++;
		}
	}
}
