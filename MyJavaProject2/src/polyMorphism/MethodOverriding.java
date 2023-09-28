package polyMorphism;

class test
{
	void show()
	{
		System.out.println("good morning");
	}
}
		
public class MethodOverriding extends test
{
	void show()
	{
		System.out.println("good evening");
	}

	public static void main(String [] args)
    {
    	MethodOverriding ob = new MethodOverriding();
    	ob.show();
    }   

}
