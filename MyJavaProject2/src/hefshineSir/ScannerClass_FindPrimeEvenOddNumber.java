package hefshineSir;

import java.util.Scanner;

public class ScannerClass_FindPrimeEvenOddNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the range by user");
		
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		System.out.println("choice your operation");
		System.out.println("1.prime number");
		System.out.println("2.even number");
		System.out.println("3.odd number");
		
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			//logic for prime
			for(int i=start; i<=end; i++)
			{
				int num=i;
				int cnt=0;
				
				for(int j=1; j<=num; j++)
				{
					if(num%j==0)
					cnt++;
				}
				if(cnt == 2)
					System.out.println(num);	
			}	
		}
		else if(choice==2)
		{
			for(int i= start; i<= end; i++)
			{
				int num=i;
				if(num%2==0)
				{
					System.out.println(num);
				}
			}
		}
		else if(choice==3)
		{
			for(int i= start; i<= end; i++)
			{
				int num=i;
				if(num%2!=0)
				{
					System.out.println(num);
				}
			}
		}
		else
		{
			System.out.println("invalid choice");
		}
		sc.close();
		

	}

}
