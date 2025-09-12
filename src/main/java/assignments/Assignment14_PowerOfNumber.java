package assignments;

public class Assignment14_PowerOfNumber {

	double output = 1;

	//method to calculate power of a number
	double powercalc(double x, int n)
	{
		//calculation for positive exponential value 
		for(int i =1; i<=n;i++)
		{
		  output *=x;
		 
		}
		//calculation for negative exponential value 
		if (n<0)
		{
			for(int i =1; i<=-n;i++)
				output *= x;
			output = 1.0/output;
		}
	
		return output;

	}
	public static void main(String[] args) {
	
		Assignment14_PowerOfNumber obj = new Assignment14_PowerOfNumber();
		//base value input
		double x = 2.70000;
		//exponential value input
		int n=-2;
		
	System.out.println("The output is:" +obj.powercalc(x, n));
	

}
}