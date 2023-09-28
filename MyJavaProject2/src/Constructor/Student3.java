package Constructor;

public class Student3 {
    
	//non-argument constructor
	
	String name;
	int id;
		
		public Student3 ()
		{
		    name="akash";
		    id=101;
		}
		
		public static void main(String [] args)
		{
			Student3 ob=new Student3 ();
			System.out.println(ob.name +" "+ob.id);
		}
}
