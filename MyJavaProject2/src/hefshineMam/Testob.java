package hefshineMam;
public class Testob 
{
	int num1;
	
	public void display()
	{
	    System.out.println("hello world");
	}
	
	public void sum () 
	{
	    int x=3;
	    int y=6;
	    int res=x+y;
	    System.out.println(res);
	}
	
	public int sub()
	{
	    int n=8;
	    int m=9;
	    int res1=n-m;
	    return res1;
	}

	public static void main(String [] args)
	{
		Testob ob=new Testob();
	    ob.sum();
	    ob.sub();
	}







}
