package TryResource;

public class RaceCon {
	private static int counter = 0;

	public static void main(String[] args) {
		 Thread thread1 = new Thread(RaceCon::incrementCounter);
	        Thread thread2 = new Thread(RaceCon::incrementCounter);

	        // Start the threads
	        thread1.start();
	        thread2.start();

	        // Wait for both threads to finish
	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Print the final value of the counter
	        System.out.println("Final Counter Value: " + counter);
	    }

	    private static void incrementCounter() {
	        for (int i = 0; i < 10000; i++) {
	            // Simulate a non-atomic operation
	            int currentValue = counter;
	            currentValue++;
	            counter = currentValue;
	        }
		

	}

}
