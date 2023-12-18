package LogicalCoding;

public class WordsCount {

	public static void main(String[] args) {
		 String inputString = "This is a Java Program";

	           int wordCount = countWords(inputString);

	        
	        System.out.println("Number of words: " + wordCount);
	    }

	    
	    private static int countWords(String input) {
	        
	        
	        String[] words = input.split("\\s+");

	  
	        return words.length;

	}

}
