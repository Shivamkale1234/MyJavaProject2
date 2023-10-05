package LogicalProgram1;

public class UpLowCaseNumbersAndSymbols {

	public static void main(String[] args) 
	{
		char ch = 'a';
		 
		 if (ch>='A' && ch<='Z')
		 { 
			 System.out.println("UpperCase");
		 }
		 else if(ch>='a' && ch<='z')
		 {
			 System.out.println("lowerCase");
		 }
		 else if(ch>='0' && ch<='9')
		 {
			 System.out.println("Number");
		 }
		 else
		 {
			 System.out.println("Special symbol");
		 }

	}

}
