package Methods;

public class Method1
{
	public void sum(int num1,int num2)
	{
		System.out.println(num1+num2);
	}

	public void sub(int num1,int num2)
	{
		System.out.println(num1-num2);
	}

	public void mul(int num1,int num2)
	{
		System.out.println(num1*num2);
	}

	public void div(int num1,int num2)
	{
		System.out.println(num1/num2);
	}

	public static void main (String [] args) 
	{
		Method1 test = new Method1();
		test.sum(10,20);
		test.sub(10,20);
		test.mul(10,20);
		test.div(10,5);
	}
}



