package Constructor;

public class Student 
{
        //object using default constructor
	
		String name;
		int id;
		int salary;
		
		public static void main (String [] args)		
		{
		   Student s1 = new Student();
		   System.out.println(s1.name +"  "+s1.id+"  "+s1.salary);
		   s1.name="riya";
		   s1.id=101;
		   s1.salary=50000;
		   System.out.println(s1.name+ " " + s1.id+"  "+s1.salary);
		}
}
