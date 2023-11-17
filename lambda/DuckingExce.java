package Lambda;

public class DuckingExce {
	 public void readFile() throws IOException {
	        // Simulating a scenario where an IOException might occur
	        throw new IOException("Unable to read file");
	    }

	    // Another method that calls the method that throws an exception
	    public void processFile() {
	        try {
	            // Calling the method that declares it might throw an IOException
	            readFile();
	        } catch (IOException e) {
	            // Handling the exception
	            System.out.println("Caught an IOException: " + e.getMessage());
	        }
	    }


	public static void main(String[] args) {
		DuckingExceptionExample example = new DuckingExceptionExample();

        // Calling the method that calls the method that throws an exception
        example.processFile();
		

	}

}
