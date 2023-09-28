package Constructor;

//constructor overloading

	public class Student4 
	{
		String name;
		int id;
		
		public Student4 ()
		{
			name=null;
			id=0;
		}
		public Student4 (String n)
		{
			name=n;
		}
		public Student4 (String n, int i)
		{
			name=n;
			id=i;
		}		
		public static void main(String [] args){
		Student4 ob1=new Student4 ();
		Student4 ob2=new Student4 ("shiva");
		Student4 ob3=new Student4 ("shivam",101);
		
		System.out.println(ob1.name +" "+ob1.id);
		System.out.println(ob2.name +" "+ob2.id);
		System.out.println(ob3.name +" "+ob3.id);

	}
	}
			