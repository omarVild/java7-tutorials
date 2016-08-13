package concurrency.executorService;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread 2 running");
		try {
			Thread.sleep(5_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 2 finished");
	}

}
