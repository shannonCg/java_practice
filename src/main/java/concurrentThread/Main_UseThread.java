package concurrentThread;

public class Main_UseThread {

	public static void main(String[] args) {
		
		Runnable run1 = () -> {
			System.out.println(CountValue.getResult(5));
		};
		
		Runnable run2 = () -> {
			System.out.println(CountValue.getResult(6));
		};
		
		//execute the runnable<run1> directly on the main thread instead of starting a new thread
		run1.run();
		
		//execute the runnable<run1> on the new thread
		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("hihi");
	}

}
