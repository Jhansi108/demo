package DupicateValues;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
	try {
	     File f=new File("C:\\Users\\SSLTP11422\\Desktop\\Chennai\\demo.txt");
	     Scanner dataReader = new Scanner(f);  
         while (dataReader.hasNextLine()) {  
             String fileData = dataReader.nextLine();  
             System.out.println(fileData);  
         }  
         dataReader.close();  
     } catch (FileNotFoundException exception) {  
         System.out.println("Unexcpected error occurred!");  
         exception.printStackTrace();  
     }  
	}

	}


