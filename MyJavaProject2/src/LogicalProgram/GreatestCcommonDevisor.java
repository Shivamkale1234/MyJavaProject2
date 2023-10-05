package LogicalProgram;

public class GreatestCcommonDevisor {

	public static void main(String[] args) 
	{
		int n1 = 21;
		int n2 = 18;
		
		for (int i = n1; i >= 1; i--) 
		{
			if(n1%i==0 && n2%i==0)
			{
				System.out.println(i);
				break;
			}
			
		}
	}

}
