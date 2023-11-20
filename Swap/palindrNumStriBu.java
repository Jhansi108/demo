package Program;

import java.util.Scanner;

public class palindrNumStriBu {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        scanner.close();

	        // Convert the number to a string using StringBuilder
	        String original = Integer.toString(num);
	        StringBuilder reversed = new StringBuilder(original).reverse();

	        // Check if the original and reversed strings are equal
	        if (original.equals(reversed.toString())) {
	            System.out.println(num + " is a palindrome.");
	        } else {
	            System.out.println(num + " is not a palindrome.");
	        }

	}

}
