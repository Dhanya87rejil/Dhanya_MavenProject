package assignments;

public class Assignment16_SearchOccurance {

	// search for all occurrences of a “Java” word in the paragraph and print their indexes.
	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		String ParaArray[] = paragraph.split(" ");
		System.out.println("The Number of words in the scenatence is :" + ParaArray.length);
		int count = 0;

		for (int i = 0; i < ParaArray.length; i++) {

			
			if(ParaArray[i].equalsIgnoreCase("Java")) {
				System.out.println("Java word is present in Array with Index :"+i);
				count++;
			}				
		}
		System.out.println("Total words with Java are :"+count);
	}
}
	