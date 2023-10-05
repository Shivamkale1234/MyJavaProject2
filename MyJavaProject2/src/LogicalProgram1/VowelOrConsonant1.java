package LogicalProgram1;

public class VowelOrConsonant1 
{
	public static void main(String[] args) 
	{
        char ch = 'a';
        
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || 
           ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
        {
        	System.out.println(ch + " is vowel");
        }
        else
        {
        	System.out.println(ch + " is consonant");
        }
	}
}
