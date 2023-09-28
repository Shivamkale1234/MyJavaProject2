package Methods;
public class Method3
{      					 //no return no argument 
	public void sum()
	{
	    int num1=21;
	    int num2=273;
	    int result=num1+num2;
	    System.out.println(result);
	}
	
	public static void main (String [] args)
	{
		Method3 ob1 = new Method3();
		ob1.sum();
	}
}
