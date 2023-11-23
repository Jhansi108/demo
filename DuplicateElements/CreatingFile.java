package DupicateValues;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) {
		try {
               File f=new File("C:\\Users\\SSLTP11422\\Desktop\\Chennai\\demo.txt");
               if(f.createNewFile()) {
            	   System.out.println("file is created.");
               }else {
            	   System.out.println("file is already exists.");
               }
		}catch(IOException exception) {
			System.out.println("file not created");
			exception.printStackTrace();
		}

	}

}
