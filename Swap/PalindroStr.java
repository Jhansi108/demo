package Program;

public class PalindroStr {

	public static void main(String[] args) {
		 String str = "WOW";

	       
	        String cleanedWord = str.toLowerCase();

	        // Reverse the word
	        String reversed = new StringBuilder(cleanedWord).reverse().toString();

	        // Check if the original and reversed strings are equal
	        if (cleanedWord.equals(reversed)) {
	            System.out.println("\"" + str + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + str + "\" is not a palindrome.");
	        }

	}

}
