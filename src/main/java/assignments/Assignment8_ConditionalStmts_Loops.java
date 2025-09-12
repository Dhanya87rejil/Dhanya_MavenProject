package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_ConditionalStmts_Loops {



	public static void main(String[] args) {
		// Bank Transactions
		int creditCount = 0;
		int debitCount = 0;
		int totalCreditAmt = 0;
		int totalDebitAmt = 0;
		int i = 0;
		int suspCount = 0;
	    int acctBal = 0;
	 
		List <Integer> txnamt = new ArrayList <Integer> ();
		txnamt.add(50000);
		txnamt.add(-2000);
		txnamt.add(3000);
		txnamt.add(-15000);
		txnamt.add(-200);
		txnamt.add(-300);
		txnamt.add(4000);
		txnamt.add(-3000);
		
		for (Integer txn : txnamt) {
			if (txn > 0) {
				
				creditCount++;
				totalCreditAmt = totalCreditAmt +txnamt.get(i);
				acctBal = acctBal+ txnamt.get(i);
			
				if (txn > 10000) {
					System.out.println("Suspicious Credit transaction amount: " +txnamt.get(i));
					suspCount++;
				}
				i++;
			}
			else  {
		
				debitCount++;
				totalDebitAmt = totalDebitAmt + txnamt.get(i);
				acctBal = acctBal+ txnamt.get(i);
			
				if (txn < -10000) {
					System.out.println("Suspicious Debit transaction amount: " +txnamt.get(i));
				suspCount++;
			}
				i++;
		}
		
		}
		
		
System.out.println("Total number of Credit transactions: " +creditCount);
System.out.println("Total number of Debit transactions: " +debitCount);
System.out.println("Total amount of Credit transactions: " +totalCreditAmt);
System.out.println("Total amount of Debit transactions: " +totalDebitAmt);	
System.out.println("Total amount remaining at the end in Bank Account: " +acctBal);
System.out.println("Suspicious txn amt:"+suspCount);

	}

}
