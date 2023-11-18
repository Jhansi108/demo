package Map;

import java.util.Scanner;

public class AddingInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		sc.close();
				int sum=num1+num2;
				System.out.println("The sum of the first " + num1 + " and " + num2 + " is : " + sum); 
		

	}

}
