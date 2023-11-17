package TryResource;

import java.io.FileOutputStream;

public class TryWithResource {

	public static void main(String[] args) {
		try(FileOutputStream file=new FileOutputStream("C:\\Users\\SSLTP11422\\eclipse-workspace\\Programs\\src\\TryResource\\TryWithResource.java")) {
			String msg="Welcome to Java";
			     
			byte byteArray[] = msg.getBytes();  
			file.write(byteArray);  
			System.out.println("Message written to file successfuly!");      
			}catch(Exception exception){  
			       System.out.println(exception);  
			}      
			
			
		}
		
		 
			
		}

	


