package hefshineSir;

public class ConvertDaysYear
{
	public static void main(String [] args)
	{
		int days = 830;
		
		int years = days/365;
		System.out.println("years : "+years);
		int rem = days%365;
		
		int months = rem/30;
		System.out.println("months : "+months);
		int rem2 = rem%30;
		
		int weeks = rem2/7;
		System.out.println("weeks : "+weeks);
		
		int day = rem2%7;
		System.out.println("days : "+day);
		
	}
}
