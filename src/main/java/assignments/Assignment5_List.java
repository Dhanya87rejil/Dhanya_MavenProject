package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment5_List {
	public static void main(String[] args) {
		//Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.

	List <String> largestCities = new ArrayList <String>();
	largestCities.add("Delhi");
	largestCities.add("Bengaluru");
	largestCities.add("Visakhapatnam");
	largestCities.add("Hyderabad");	
	largestCities.add("Lucknow");	
	
	List <Integer> Cityarea = new ArrayList <Integer> ();
	Cityarea.add(1484);
	Cityarea.add(741);
	Cityarea.add(682);
	Cityarea.add(650);
	Cityarea.add(631);
	
	System.out.println("The 3rd largest city in India is " +largestCities.get(2) + " and its area is " +Cityarea.get(2)+" km²");  
	System.out.println("The 4th largest city in India is " +largestCities.get(3) + " and its area is " +Cityarea.get(3)+" km²"); 
	int total;
	total = Cityarea.get(2)+ Cityarea.get(3);
	
	System.out.println("The Total area of 3rd and 4th largest city in India is " +total +" km²");
	
	
}
}