package hefshineMam;

public class EStudentData {
	
	String name;
	int rollno;
	int age;
    String bloodgroup;

	public static void main(String[] args) 
	{
		EStudentData ob1 = new EStudentData();
		ob1.name = "suresh";
		ob1.rollno = 101;
		ob1.age = 21;
		ob1.bloodgroup = "A+";
		
		EStudentData ob2 = new EStudentData();
		ob2.name = "ramesh";
		ob2.rollno = 102;
		ob2.age = 20;
		ob2.bloodgroup = "A-";
		
		EStudentData ob3 = new EStudentData();
		ob3.name = "yogesh";
		ob3.rollno = 103;
		ob3.age = 22;
		ob3.bloodgroup = "AB+";
		
		EStudentData ob4 = new EStudentData();
		ob4.name = "ganesh";
		ob4.rollno = 104;
		ob4.age = 21;
		ob4.bloodgroup = "B+";
		
		EStudentData ob5 = new EStudentData();
		ob5.name = "mahesh";
		ob5.rollno = 105;
		ob5.age = 22;
		ob5.bloodgroup = "B-";
		 
		System.out.println(ob1.name +" "+ ob1.rollno +" "+ ob1.age +" "+ ob1.bloodgroup);
		System.out.println(ob2.name +" "+ ob2.rollno +" "+ ob2.age +" "+ ob2.bloodgroup);
		System.out.println(ob3.name +" "+ ob3.rollno +" "+ ob3.age +" "+ ob3.bloodgroup);
		System.out.println(ob4.name +" "+ ob4.rollno +" "+ ob4.age +" "+ ob4.bloodgroup);
		System.out.println(ob5.name +" "+ ob5.rollno +" "+ ob5.age +" "+ ob5.bloodgroup);
		
	}
}
