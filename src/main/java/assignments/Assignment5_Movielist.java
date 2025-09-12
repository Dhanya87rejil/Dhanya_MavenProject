package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment5_Movielist {

	public static void main(String[] args) {
		//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		List <String> movieNames = new ArrayList <String> ();
		movieNames.add("Dangal");
		movieNames.add("Baahubali 2: The Conclusion");
		movieNames.add("Pushpa: The Rule - Part 2");
		movieNames.add("RRR");
		movieNames.add("K.G.F: Chapter 2");
		
		System.out.println("The 3rd Top highest-grossing movies of all time is");
		System.out.println(movieNames.get(2));
			
	}

}
