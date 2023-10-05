package LogicalProgram1;

public class PrimeNumber1 
{
	
	public static void main(String[] args) 
	{
		int start=8;
		int end=50;
		
		for (int i = start; i <= end; i++) 
		{	
        	 int num = i;
        	 int cnt=0;
        	 
        	 for(int j=1; j<= num; j++) 
        	 { 
        		if (num%j==0)
        		{
        			cnt++;
        		}
        	 }
        	 
        	 if(cnt==2)
        	 {
        		 System.out.println(num); 
        	 }
		}
	}
     

}
