package concurrency.executorService;

public class Thread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread 1 running");
		try {
			Thread.sleep(3_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 1 finished");
		
	}

}
