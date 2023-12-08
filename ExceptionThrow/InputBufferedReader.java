package ExceptionThrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferedReader {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your name: ");
            
            
            String name = reader.readLine();
            
            System.out.println("Hello, " + name + "!");

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
