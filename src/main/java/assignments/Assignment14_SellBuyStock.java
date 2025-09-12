package assignments;

public class Assignment14_SellBuyStock {

	public static void main(String[] args){
 int price[]= {7,3,2,2,1};
int buyday= 0;
int sellday= 0;
int maxProfit = 0;
int profit = 0;

// Outer loop: pick each day as a potential buying day
	for(int i =0; i<price.length-1;i++)
	{

        // Inner loop: pick each subsequent day as a potential selling day
		for (int j= i+1;j< price.length;j++)
		{
			// Calculate the profit if we buy on day i and sell on day j
				profit = price[j]-price[i];// e.g., profit = price at j - price at i
			
		if (profit > maxProfit)
		{
			maxProfit = profit;
			// increment index value plus 1 to arrive the correct buy and sell day
			buyday = i+1;
			sellday = j+1;
		}

		}
	 }

	if (maxProfit>0)
	{
		System.out.println("The Maximum profit buy day is: " +buyday);
		System.out.println("The Maximum profit sell day is: " +sellday);
		System.out.println("The Maximum profit  is: " +maxProfit);
	
	}
	else
	{
		System.out.println("There is no profit.Please dont do any transaction");
	}
}

}
