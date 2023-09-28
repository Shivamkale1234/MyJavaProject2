package Constructor;

public class Student 
{
        //object using default constructor
	
		String name;
		int id;
		
		public static void main (String [] args)		
		{
		   Student s1 = new Student();
		   System.out.println(s1.name +"  "+s1.id);
		   s1.name="riya";
		   s1.id=101;
		   System.out.println(s1.name+ " " + s1.id);
		}
}
