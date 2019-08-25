package thread;

public class Main_createNewThread {

	public static void main(String[] args) {
		//create new thread from subclass of Thread
		//1. create subclass of Thread
		Thread t1 = new ThreadTest1("subclass of Thread");
		//2. create anonymous subclass of Thread
		Thread t2 = new Thread("anonymous subclass of Thread"){
			@Override
			public void run(){
				System.out.println("Thread ["+getName()+"] executed");
			}
		};
		
		
		//create new class implements Runnable
		//1. create class implements Runnable
		Thread t3 = new Thread(new ThreadTest2(), "implement Runnable");
		//2. create anonymous implementation of Runnable
		Thread t4 = new Thread(new Runnable(){
			@Override
			public void run(){
				String threadName = Thread.currentThread().getName();
				System.out.println("Thread ["+threadName+"] executed");
			}
		}, "anonymous implementation of Runnable");
		//3. create lambda implementation of Runnable
		Thread t5 = new Thread(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Thread ["+threadName+"] executed");
		}, "lambda implementation of Runnable");
		
		// start a new thread, call start() rather than run()
		// and threads execute run() method in parallel not sequentially
		// The JVM and/or operating system determines the order in which the threads are executed.
		t1.start(); 
		t2.start();
		t3.start();
		t4.start();
		t5.start();
//		t1.run(); 
//		t2.run();
//		t3.run();
//		t4.run();
//		t5.run();
	}
}
