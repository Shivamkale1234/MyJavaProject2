package hefshineSir;

public class Factorial
{
    public static void main(String[] args) 
    {
        int num=8;
        int fact = 1;
        
        for (int i=1; i<=num; i++)
        {
            fact=fact*i;   //fact=1*1=1
                           //fact=1*2=2
                           //fact=2*3=6 
                           //fact=6*4=24 continue
        }
        
        System.out.println(fact);  //total fact=24 
    }

}
