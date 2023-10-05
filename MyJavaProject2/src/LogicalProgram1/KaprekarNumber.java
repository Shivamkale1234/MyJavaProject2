package LogicalProgram1;

public class KaprekarNumber 
{
	public static void main(String[] args) 
	{		
	    int	num = 99;
	    int temp=num;
	    int sq = num*num;
	    int digitcnt=0;
	    
	    while(num>0)
	    {
	    	num=num/10;
	    	digitcnt++;
	    }
	    
	    int div = (int) Math.pow(10, digitcnt);
	    int f = sq%div;
	    int s = sq/div;
	    
	    if((f+s)==temp)
	    {
	    	System.out.println("kaprekar number");
	    }
	    else
	    {
	    	System.out.println("not kaprekar number");
	    }   
	}
}
//45*45=2025 =20+25= 45 is a kaprekar number
//10*10=100 is not a kaprekar number
//13*13=169 =1+69 or 16+9 = is not a kaprekar number
