package JavaTutorial;

import java.util.Scanner;

public class MathPro {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	          System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();

	        double absoluteValue = Math.abs(number);
	        double squareRoot = Math.sqrt(number);
	        double powerOfTwo = Math.pow(number, 2);
	        double cosineValue = Math.cos(number);
	        double randomValue = Math.random(); 

	       
	        System.out.println("Absolute Value: " + absoluteValue);
	        System.out.println("Square Root: " + squareRoot);
	        System.out.println("Power of Two: " + powerOfTwo);
	        System.out.println("Cosine Value: " + cosineValue);
	        System.out.println("Random Value: " + randomValue);

	}

}
