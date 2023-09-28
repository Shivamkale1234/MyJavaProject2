package Inheritance;

class Bank 
{
	public void account()
    {
		System.out.println("This is the process for accout creation");
    }
	
	public void withdraw()
	{
		System.out.println("This is the process for withdraw");
	}
}
class HDFCClass extends Bank
{
	public void bankName()
	{
	System.out.println("The name of bank is HDFC");
	}
}

public class Main_hararical_I 
{
	public static void main(String[] args) 
	{
		HDFCClass obj=new HDFCClass();
		obj.bankName();
		obj.account();
		obj.withdraw();
		
		Bank obj1=new Bank();
		obj1.account();
		obj1.withdraw();
	}
}