package DupicateValues;

import java.io.File;

public class DeletingTheFile {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\SSLTP11422\\Desktop\\Chennai\\demo.txt");   
	    if (f.delete()) {   
	      System.out.println(f.getName()+ " file is deleted successfully.");  
	    } else {  
	      System.out.println("Unexpected error found in deletion of the file.");  
	    }   
	}

}
