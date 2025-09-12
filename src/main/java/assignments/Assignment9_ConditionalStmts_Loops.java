package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment9_ConditionalStmts_Loops {
	

	public static void main(String[] args) {

		//store employee name
	String[] empnames = new String[5];
	empnames[0]="Alice Johnson";
	empnames[1]="Bob Smith";
	empnames[2]="Carol Davis";
	empnames[3]="David Brown";
	empnames[4]="Eva Green";
	
	//store emp details like base salary, experience,rating 
	Double[] empdetails1 = new Double[3];
	empdetails1[0] = 75000.0;
	empdetails1[1] = 5.1;
	empdetails1[2] = 4.2;
	Double [] empdetails2 = {68000.0,3.2,3.8};
	Double [] empdetails3 = {82000.0,7.1,4.5};
	Double [] empdetails4 = {90000.0,10.2,2.5};
	Double [] empdetails5 = {60000.0,2.4,3.5};
	
	//store employee data in a Map
	
 Map <String,Double[]> empdata =  new HashMap <String,Double[]> ();
 empdata.put(empnames[0], empdetails1);
 empdata.put(empnames[1], empdetails2);
 empdata.put(empnames[2], empdetails3);
 empdata.put(empnames[3], empdetails4);
 empdata.put(empnames[4], empdetails5);
 
 //Map to store hike percentage against emp name
 
 Map <String,Double> output = new HashMap <String,Double>();
 
 // Calculate hike for each employee using common method and print it
 for(String emp : empnames)
 {
	 Double[] data = empdata.get(emp);
	double hikep = hikecalc(data[0],data[1],data[2]);
	output.put(emp, hikep);
	 
	System.out.println("Employee: "+emp  +" Hike% : "+hikep );
	 
	 
 }


	}
//common method to calculate hike and hike percentage
	 public static double hikecalc( double baseSalary,double experience, double rating)
	 {
		 double variablePayPercent;
		 double bonus;
		 double reward;
		 
		 if (rating >=4.0) {
			 variablePayPercent = 15.0;
			 bonus = 1500;
		 }
		 else if (rating >=3 && rating < 4)
		 {
			 variablePayPercent = 10.0;
			 bonus = 3.0;
		 }
		 else
		 {
			 variablePayPercent = 3.0;
			 bonus = 300;
			 
		 }
       
		 if (experience >= 5) {
			 
			 reward = 5000;
		 }
		 else
		 {
			 reward = 0;
			 
		 }
		 
		 //calculate hike and hike percentage
		double hike = ((baseSalary * variablePayPercent)/100) + bonus + reward ;
		double hikePercent = ((hike/baseSalary)*100);
		return hikePercent;
		 
	 }
			 
}				 
 
 
 
 
	

	


