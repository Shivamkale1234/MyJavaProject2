package veriable;

public class Sample1 {
	
	// Variables are nothing but piece of memory use to store information.
    // one variable can store 1 information at a time.
	// Variables also used in information reusability.
	// To utilize variables in java programming language we need to follow below steps:
	//   1. Variable declaration (Allocating/Reserving memory)
	//   2. Variable Initialization (Assigning or Inserting value)
	//   3. Variable Usage
	
	public static void main(String[] args) {
		
		        //step1 : variable declaration
		
				String name2;           
				byte num;
				short rollnum;
				int monum;
				long unlimitednum;
				char grade;
				boolean TF;
				float per;
				double per1;
				
			    //step2 : variable initialization
				
				name2 =  "shivam kale";      
				num  =  125;
				rollnum =  12512;
				monum = 1234567890;
				unlimitednum = 1234567890;
				grade = 'A';
				TF = 5>3;
				per = 60.20f;
				per1 = 60.75;
				
			    //step3 : variable usage
				
				System.out.println("student name : "+name2);
				System.out.println("student num : "+num);
				System.out.println("student num : "+num);
				System.out.println("student rollnum : "+rollnum);
				System.out.println("student mobile no : "+monum);
				System.out.println(unlimitednum); 
				System.out.println("student grade : "+grade+"+");
				System.out.println("condition : "+TF);
				System.out.println("student percentage : "+per);
				System.out.println("student percentage : "+per1+"%");
		
	            //Declaration,Initialization and Usage.
				String name1;
	        	name1 = "qwertyuiopsdfghjklzxcvbnmrtyu";
	        	System.out.println(name1);
	}

}
