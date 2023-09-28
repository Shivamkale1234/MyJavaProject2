package Constructor;

public class Student2 {
    
	//argument constructor
	
	String name;
	int id;
		
	public Student2 (String n, int i)
	{
    	name=n;
		id=i;
	}
		
	public static void main(String [] args)
	{
		Student2 ob=new Student2 ("akash",100);
		System.out.println(ob.name +" "+ob.id);
	}
}