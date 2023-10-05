package LogicalProgram;

public class SumOfDigitsNumber {

	public static void main(String[] args) 
	{
		int num=12;
		int sum=0;
		
		for (int i = 1; i < num; i++) 
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);	
	}

}