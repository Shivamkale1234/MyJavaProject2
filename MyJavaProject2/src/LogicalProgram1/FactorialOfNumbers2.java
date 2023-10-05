package LogicalProgram1;

public class FactorialOfNumbers2
{
    public static void main(String[] args) 
    {
        int num=5;
        int fact = 1;
        
        while (num>=1)
        {
            fact=fact*num;
            num--;
        }
        System.out.println(fact);
    }
}
