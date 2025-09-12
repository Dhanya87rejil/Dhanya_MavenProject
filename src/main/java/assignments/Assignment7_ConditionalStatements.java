package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {
		// A bank evaluates loan applicants based on the following Criteria
		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
        boolean isEmployed = true;
        float debtToIncomeRatio = 35.0f;
        
        if(creditScore<650)
			{
				System.out.println("Loan is denied for customer: " +customerName +" as the creditscore doesnt match the eligibilty criteria");	
				
			}
        
			
			else if ((creditScore >= 650) && (creditScore <=750 )){
				if (income >= 50000) {
					if(! isEmployed ) {
						System.out.println("Loan is denied for customer: "+customerName +" based on Employment Status");
					}
					else {
					if (debtToIncomeRatio <40) {
						System.out.println("Loan is approved for customer: "+customerName +" based on Creditscore, Income, Employment Status and DTI ratio");
					}
					else
					{
						System.out.println("Loan is denied for customer: " +customerName +"  as the DTI ratio doesnt match the eligibilty criteria");	
					}
				}
					
				}
				else  {
					System.out.println("Loan is denied for customer: " +customerName +"  as the income doesnt match the eligibilty criteria");	
				}
				
		}
			else
		{
		System.out.println("Loan is automatically approved for customer: "+customerName +" based on creditscore");
		}
	
	}

}
