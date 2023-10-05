package LogicalProgram;

public class SumOfNaturalNumbers {
	//sum of  all number 

	public static void main(String[] args) 
	{
		int start = 1;
		int end = 20;
		int sum = 0;
		
		for (int i = start; i <= end; i++) 
		{
			if(i%6==0) 
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
