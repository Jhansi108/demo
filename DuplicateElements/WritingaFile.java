package DupicateValues;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingaFile {

	public static void main(String[] args) {
		try {
			FileWriter fwrite=new FileWriter("C:\\Users\\SSLTP11422\\Desktop\\Chennai\\demo.txt");
			fwrite.write("There are several File Operations like creating a new File, getting information about File, writing into a File, reading from a File and deleting a File.");
		fwrite.close();
		System.out.println("Successfully wrote");
		}
		catch(IOException e) {
			System.out.println("Error");
			e.getStackTrace();
			
		}

	}

}
