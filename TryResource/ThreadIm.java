package TryResource;

public class ThreadIm implements Runnable {
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		ThreadIm t1=new ThreadIm();
		Thread t=new Thread(t1);
		t.start();

	}

}
