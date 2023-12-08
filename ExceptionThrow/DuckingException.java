package ExceptionThrow;

import java.io.IOException;

public class DuckingException {

	public static void main(String[] args) {
		 try {
	                  riskyOperation();
	        } catch (IOException e) {
	               System.out.println("An IOException occurred: " + e.getMessage());
	        }
	    }

	       static void riskyOperation() throws IOException {
	        
	        throw new IOException("This is a simulated IOException");
	}

}
