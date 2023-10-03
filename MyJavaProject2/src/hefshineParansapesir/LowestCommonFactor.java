package hefshineParansapesir;

public class LowestCommonFactor {

	public static void main(String[] args) 
	{
		int n1 = 21;
		int n2 = 18;
		
		for (int i = n2; ; i++) 
		{
			if(i%n1==0 && i%n2==0)
			{
				System.out.println(i);
				break;
			}
			
		}
	}

}
