package Loops;

// at least one time code will be executed in this 
// loop statement then another check the condition.

public class DoWhile
{
    public static void main(String[] args) 
    {
        int i=1;
        
        do 
        {
            System.out.println(i);
            i++;
        }
        
        while(i<=10);
    }
}