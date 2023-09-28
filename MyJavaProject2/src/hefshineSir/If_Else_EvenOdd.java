package hefshineSir;

public class If_Else_EvenOdd
{
	public void evod (int num)
	{
	if (num%2==0)
	{
		System.out.println("Even");
	}
	else 
	{
		System.out.println("Odd");
	}
	
}
public static void main (String [] args)
{
	If_Else_EvenOdd test = new If_Else_EvenOdd();
	test.evod(43);

	}

}
