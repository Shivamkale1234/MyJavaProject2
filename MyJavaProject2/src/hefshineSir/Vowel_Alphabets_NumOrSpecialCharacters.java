package hefshineSir;
public class Vowel_Alphabets_NumOrSpecialCharacters
{
	public static void main (String [] args )
	{
	
	 char ch = 'A';
	 
	 if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
	 { 
		 System.out.println("alphabets");
	 }
	 else if (ch>=0 && ch<=9)
	 {
		 System.out.println("number");
	 }
	 else
	 {
		 System.out.println("special characters");
	 }
	
	}

}
