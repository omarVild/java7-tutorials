package concurrency.executorService;

import utils.Util;

public class Thread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread 1 running");
		try {
			Thread.sleep(Util.randomNumber());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 1 finished");
		
	}
	
}
