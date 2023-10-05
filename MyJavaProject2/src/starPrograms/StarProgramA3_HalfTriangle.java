package starPrograms;

public class StarProgramA3_HalfTriangle
{
	public static void main(String[] args) 
	{
		int end=5;
		for (int i = 1; i <= 5; i++) 
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
