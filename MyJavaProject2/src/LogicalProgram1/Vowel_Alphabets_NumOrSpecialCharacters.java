package LogicalProgram1;
public class Vowel_Alphabets_NumOrSpecialCharacters
{
	public static void main (String [] args )
	{
	
	 char ch = 'A';
	 
	 if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
	 { 
		 System.out.println("Alphabets");
	 }
	 else if (ch>=0 && ch<=9)
	 {
		 System.out.println("Number");
	 }
	 else
	 {
		 System.out.println("Special characters");
	 }
	
	}

}
