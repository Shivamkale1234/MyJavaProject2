package LogicalProgram;

public class Pythagoras {

	public static void main(String[] args) 
	{
		int a=3;
		int b=4;
		int c=5;
		
		if (a<=0 || b<=0 || c<=0) 
		{
			System.out.println("side can not be <=0 ");			
		} 
		else 
		{
			if((a*a+b*b == c*c) || (b*b+c*c == a*a) || (c*c+a*a == b*b))
			{
				System.out.println("possible");
			}
			else
			{
				System.out.println("not possible");
			}
		}
		

	}

}
