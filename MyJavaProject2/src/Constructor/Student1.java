package Constructor;

public class Student1 
{								
	//no return with arguments
	
	String name;
	int id;
		
    void setValues(String n, int i)     
    {
        name = n;
        id=i;
        System.out.println(n+" "+i);
        System.out.println(name+" "+id);  
    }
 
     public static void main (String [] args)
     {
    	 Student1 obj = new Student1();
         obj.setValues("riya",101);   
     }	
}
