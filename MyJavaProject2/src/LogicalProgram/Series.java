package LogicalProgram;

public class Series 
{
	public static void main(String[] args) 
	{
		int num=0;
		int diff=1;
		int n=2;
		int sum=0;
		
		while (diff<=n) 
		{
				num=num+diff;
				sum=sum+num;
				diff++;
		}
		System.out.println(sum);
	}

}
