package ThreadStates;

public class ThreadStatePro  {

	public static void main(String[] args)throws InterruptedException {
		Thread myThread = new Thread(() -> {
            try {
                
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        
        System.out.println("Initial State: " + myThread.getState());

       
        myThread.start();

        
        Thread.sleep(500);

      
        System.out.println("State after starting: " + myThread.getState());

       
        myThread.join();

        
        System.out.println("Final State: " + myThread.getState());
    }


	

}

