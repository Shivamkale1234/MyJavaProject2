package polyMorphism;

public class ConstructorOverloading {

	String name;
	int id;
	float salary;
	
	ConstructorOverloading()
	{
		name = null;
		id =0;
		salary =0;
	}
	
	ConstructorOverloading(String name)
	{
		this.name = name;
	}
	
	ConstructorOverloading(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	ConstructorOverloading(String name, int id, int salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	void displaydata()
	{
		System.out.println("name: "+ name +"  id: "+ id + "  salary: "+salary);
	}
	
	public static void main(String[] args) 
	{
		ConstructorOverloading ob = new ConstructorOverloading();
		ConstructorOverloading ob1 = new ConstructorOverloading("shivam");
		ConstructorOverloading ob2 = new ConstructorOverloading("shivam",101);
		ConstructorOverloading ob3 = new ConstructorOverloading("shivam",102,50000);
		
		ob.displaydata();
		ob1.displaydata();
		ob2.displaydata();
		ob3.displaydata();
	}
}
