package assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment5_Set {

	public static void main(String[] args) {
		// Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
Set <String> topTouristPlace = new LinkedHashSet <String> ();

topTouristPlace.add("Eiffel Tower - France");
topTouristPlace.add("Great Wall of China - China");
topTouristPlace.add("Niagra Falls - Cananda");
topTouristPlace.add("Times Square - USA");
topTouristPlace.add("National Mall and Memorial Park - USA");
topTouristPlace.add("Sydney Opera House - Austarlia");
topTouristPlace.add("Machu Picchu - Peru");
topTouristPlace.add("Buckingham Palance - Europe");
topTouristPlace.add("Victoria Harbour - HongKong");
topTouristPlace.add("The Colosseum - Italy");


Set <String> topTouristSize = new LinkedHashSet <String> ();
topTouristSize.add("330m tall");
topTouristSize.add("13171 miles");
topTouristSize.add("209.7 km²");
topTouristSize.add("3 acres");
topTouristSize.add("1000 acres");
topTouristSize.add("Length 183 meters and Width 120 meters");
topTouristSize.add("325.9 km²");
topTouristSize.add("77000 m²");
topTouristSize.add("41.88 km²");
topTouristSize.add("Length 189 meters and Width 156 meters");

System.out.println(topTouristPlace.size()+ " Top Tourist Place across the World are the following");
System.out.println(topTouristPlace);
System.out.println("The Size of each of these Tourist place are");
System.out.println(topTouristSize);


	}

}
