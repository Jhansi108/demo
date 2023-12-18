package LogicalCoding;

import java.util.Scanner;

public class WordsCounts {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	          System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	         String[] words = inputString.split("\\s+");

	         int numWords = words.length;

	          System.out.println("Number of words: " + numWords);

	}

}
