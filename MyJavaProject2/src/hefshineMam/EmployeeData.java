package hefshineMam;

public class EmployeeData {
	
	String name;
	int id;
	int age;
    String bloodgroup;

	public static void main(String[] args) {
		 
	
		EmployeeData ob1 = new EmployeeData();
		ob1.name = "suresh sharma";
		ob1.id = 101;
		ob1.age = 21;
		ob1.bloodgroup = "A+";
		
		EmployeeData ob2 = new EmployeeData();
		ob2.name = "ramesh dongre";
		ob2.id = 102;
		ob2.age = 20;
		ob2.bloodgroup = "A-";
		
		EmployeeData ob3 = new EmployeeData();
		ob3.name = "yogesh chavan";
		ob3.id = 103;
		ob3.age = 22;
		ob3.bloodgroup = "AB+";
		
		EmployeeData ob4 = new EmployeeData();
		ob4.name = "ganesh bhagwat";
		ob4.id = 104;
		ob4.age = 21;
		ob4.bloodgroup = "B+";
		
		EmployeeData ob5 = new EmployeeData();
		ob5.name = "mahesh chopade ";
		ob5.id = 105;
		ob5.age = 22;
		ob5.bloodgroup = "B-";
		 
		System.out.println(ob1.name +" "+ ob1.id +" "+ ob1.age +" "+ ob1.bloodgroup);
		System.out.println(ob2.name +" "+ ob2.id +" "+ ob2.age +" "+ ob2.bloodgroup);
		System.out.println(ob3.name +" "+ ob3.id +" "+ ob3.age +" "+ ob3.bloodgroup);
		System.out.println(ob4.name +" "+ ob4.id +" "+ ob4.age +" "+ ob4.bloodgroup);
		System.out.println(ob5.name +" "+ ob5.id +" "+ ob5.age +" "+ ob5.bloodgroup);
	}

}
