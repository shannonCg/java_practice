package concurrentThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main_UseExecutors {
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newWorkStealingPool();
		
		executor.submit(() -> System.out.println(CountValue.getResult(5)));
//		executor.shutdown(); // close all threads in the pool
		executor.submit(() -> System.out.println(CountValue.getResult(6)));
		executor.shutdown();
	}
}
