package concurrency.executorService;

import utils.Util;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread 2 running");
		try {
			Thread.sleep(Util.randomNumber());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 2 finished");
	}


}
