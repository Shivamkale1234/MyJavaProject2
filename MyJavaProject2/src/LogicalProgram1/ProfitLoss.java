package LogicalProgram1;

public class ProfitLoss 
{
	public static void main(String[] args) 
	{
		int buy  = 10000;
		int sell = 15000;
		
		if(sell>buy)
		{
			int profit = sell-buy;
			System.out.println(profit + " profit");
		}
		else
		{
			int loss = buy-sell;
			System.out.println(loss + " loss");
		}
	}
}
