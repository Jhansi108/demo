package TryResource;

public class ThreadvsRun extends Thread {
	public void run()
	{
		System.out.println("run the method");
	}

	public static void main(String[] args) {
		ThreadvsRun tr=new ThreadvsRun();
		tr.run();
		System.out.println("program");
		

	}

}
