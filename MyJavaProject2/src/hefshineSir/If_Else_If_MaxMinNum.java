package hefshineSir;
public class If_Else_If_MaxMinNum
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
		If_Else_If_MaxMinNum mm=new If_Else_If_MaxMinNum ();
	    mm.maxmin(8734,9237,3878);
	}
}
