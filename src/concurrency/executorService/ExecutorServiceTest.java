package concurrency.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		
		ExecutorService executor = Executors.newFixedThreadPool(runtime.availableProcessors());
		executor.submit(new Thread1());
		executor.submit(new Thread2());
		
		executor.shutdown();
		while(!executor.isTerminated()){
			System.out.println("waiting...");
			try {
				Thread.sleep(1_000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Process finished");
		
	}
}
