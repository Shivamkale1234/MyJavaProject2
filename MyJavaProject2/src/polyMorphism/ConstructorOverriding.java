package polyMorphism;

public class ConstructorOverriding {

	
	    ConstructorOverriding()
		{
			System.out.println("zero arguments method");
		}
		
	    ConstructorOverriding(String message)
		{
			System.out.println(message);
		}
		
	    ConstructorOverriding(int x, String message)
		{
			System.out.println(x + " " + message);
		}

        public static void main(String [] args)
        {
        	new ConstructorOverriding(); 
        	new ConstructorOverriding("one arguments constructor");
        	new ConstructorOverriding(2," arguments constructor");
        }

}
