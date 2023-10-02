package hefshineSir;

public class For_Loop_PrimeRange1To50 {

	//find prime number between range 1 to 50

	public static void main(String[] args) 
	{
         for(int i=1; i<=50; i++)
         {
        	 int num = i;
        	 int cnt=0;
        	 
        	 for(int j=1; j<=num; j++) 
        	 {
        		 
        		if (num%j==0)
        		cnt++;
        		
        	 }
        	 if(cnt==2)
        	 System.out.println(num); 
         }
	}

}
