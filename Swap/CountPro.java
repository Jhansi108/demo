package Program;

import java.util.Scanner;

public class CountPro {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        scanner.close();

	       int digitCount = countDigits(number);

	        System.out.println("Number of digits in " + number + ": " + digitCount);
	    }

	    	    private static int countDigits(int num) {
	        
	        num = Math.abs(num);

	       
	        int count = 0;

	       
	        while (num > 0) {
	            num /= 10;     
	            count++;   
	        }

	        return count;

	}

}
