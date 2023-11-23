package DupicateValues;

import java.io.File;

public class FileInfor {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\SSLTP11422\\Desktop\\Chennai\\demo.txt");
		if(f.exists()) {
			System.out.println("The name of the file is : " + f.getName());
			System.out.println("The absolute path of the file is : " + f.getAbsolutePath());
			System.out.println("Is file writable ? " + f.canWrite());
			System.out.println("Is file readable ? " + f.canRead());
			System.out.println("The size of the file bytes : " + f.length());
		}else {
			System.out.println("file does not exists");
		}

	}

}
