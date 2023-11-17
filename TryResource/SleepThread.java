package TryResource;

public class SleepThread extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SleepThread s1=new SleepThread();
		//SleepThread s2= new SleepThread();
		s1.start();
		//s2.start();
		

	}

}
