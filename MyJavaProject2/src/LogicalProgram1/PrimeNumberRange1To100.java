package LogicalProgram1;

public class PrimeNumberRange1To100 {

	public static void main(String[] args) 
	{
		for (int i = 1; i <=100; i++) 
		{
			int num =i;
			int cnt =0;
			
			for (int j = 1; j <=num; j++) 
			{
				if (num%j==0) 
				{
					cnt++;	
				}
			}
			if (cnt==2) 
			{
				System.out.println(num);
			} 
			else
			{
				System.out.println("Not Prime");
			}
		}
	}
}
