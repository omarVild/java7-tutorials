package concurrency.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Ejemplo de Interface ExecutorService, usando static newFixedThreadPool() 
 * @author Keith
 *
 */

public class ExecutorServiceTest {
	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		
		/*
		 * Obtenemos el numero de procesadores disponibles.
		 */
		int numeroHilos =runtime.availableProcessors();
		/*
		 * newFixedThreadPool recibe como parametro el numero de hilos a ejecutar.
		 */
		ExecutorService executor = Executors.newFixedThreadPool(numeroHilos);
		executor.submit(new Thread1());
		executor.submit(new Thread2());
		
		executor.shutdown();
		/*
		 * Esperamos a que los hilos terminen de ejecutarse
		 */
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
