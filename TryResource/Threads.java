package TryResource;

public class Threads extends Thread {
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		Threads t=new Threads();
		t.run();
		

	}

}
