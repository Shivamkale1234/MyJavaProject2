package LogicalProgram1;
public class CompoundInterest
{
	public static void main(String [] args)
	{
	
	    //p*(1+r/n)^n*t
	
		int p = 1000;
		double r = 0.10;
		int n = 1;
		int t = 5;
		
		double fpart = 1+r/n;
		int spart = n*t;
		
		double ci = p*Math.pow(fpart,spart);
        System.out.println(ci);		

		
	}
}
