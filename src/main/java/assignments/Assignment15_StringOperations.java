package assignments;

public class Assignment15_StringOperations {

	public static void main(String[] args) {
		// 1.Count the total number of words in the sentence.
		String scentence = "Java programming is fun and challenging";
		System.out.println("Total number of characters in the scentence: " + scentence.length());
		String words[] = scentence.split(" ");
		System.out.println("Total number of words in the sentence: " + words.length);

		// 2. Print the sentence words in reverse order.
		String reverseScentence = "";
		for (int i = words.length - 1; i >= 0; i--) {
			reverseScentence = reverseScentence + words[i] + " ";
		}
		System.out.println("The reverse of the scentence is: " + reverseScentence);

		// 3. Convert the first character of each word to uppercase and print original
		// sentence
		String uppercaseScentence = "";

		for (String word : words) {
			uppercaseScentence = uppercaseScentence + word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
		}
		System.out.println(uppercaseScentence);

	}
}

/*
 * 3.Another method of converting first character in each word to uppercase and
 * print String finalWord[] = new String[words.length]; for(int i
 * =0;i<=words.length-1;i++) { String word= words[i]; String firstLetter =
 * word.substring(0, 1).toUpperCase(); String remainingLetter=
 * word.substring(1); finalWord[i]=firstLetter+remainingLetter;
 * System.out.print(finalWord[i]+ " "); }
 */