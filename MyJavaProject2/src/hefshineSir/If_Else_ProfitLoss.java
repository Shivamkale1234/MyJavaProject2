package hefshineSir;

public class If_Else_ProfitLoss {

	public static void main(String[] args) {

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
