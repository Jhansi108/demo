package JavaTutorial;

import java.util.Scanner;

public class StringUserInput {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();              
		System.out.print("You have entered: "+str);

	}

}
