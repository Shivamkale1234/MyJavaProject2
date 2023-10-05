package LogicalProgram1;

public class base_power
{
	public static void main(String[] args) 
	{
		int base = 2;
		int pow = 6;
		int ans=1;
		
        for(int i=1; i<=pow; i++)
        {
        	ans=ans*base;
        }
        System.out.println(ans);	
	}
}
//2*2*2*2*2*2=64
