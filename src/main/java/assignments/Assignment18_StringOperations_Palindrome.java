package assignments;

public class Assignment18_StringOperations_Palindrome {

	public static void main(String[] args) {
	
		String phrase = "A man, a plan, a canal: Panama";
		String convert = phrase.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		String reversePhrase = "";
		for (int i = convert.length()-1;i>=0;i--)
		{
			reversePhrase = reversePhrase + convert.charAt(i);
		}

	if (convert.equals(reversePhrase) == true)
	{
		System.out.println("The String is a Palindrome");
	}
	else
		System.out.println("The String is not a Palindrome");
		
	}

}
