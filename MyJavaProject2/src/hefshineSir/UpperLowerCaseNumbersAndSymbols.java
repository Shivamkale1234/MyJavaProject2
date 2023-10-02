package hefshineSir;

public class UpperLowerCaseNumbersAndSymbols {

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
			 System.out.println("number");
		 }
		 else
		 {
			 System.out.println("special symbol");
		 }

	}

}
