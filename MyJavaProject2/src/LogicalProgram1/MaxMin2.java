package LogicalProgram1;
public class MaxMin2
{
	public void maxmin (int num1, int num2, int num3)
	{
	if (num1>num2 && num1>num3)
	{
	    System.out.println(num1+" is greater.");
	}
	else if (num2>num1 && num2>num3)
	{
	    System.out.println(num2+" is greater.");
	}
	else 
	{
	    System.out.println(num3+" is greater.");
	}
}
	
	public static void main (String [] args)
	{
		MaxMin2 mm=new MaxMin2 ();
	    mm.maxmin(8734,9237,3878);
	}
}
