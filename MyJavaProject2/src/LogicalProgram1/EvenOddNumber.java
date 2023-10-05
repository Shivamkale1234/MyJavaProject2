package LogicalProgram1;

public class EvenOddNumber
{
	public void method (int num)
	{
	if (num%2==0)
	{
		System.out.println("even number");
	}
	else 
	{
		System.out.println("odd number");
	}
	
}
    public static void main (String [] args)
    {
    	EvenOddNumber test = new EvenOddNumber();
    	test.method(43);
	}
}
