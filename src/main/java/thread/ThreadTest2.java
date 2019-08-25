package thread;

public class ThreadTest2 implements Runnable {

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread ["+threadName+"] executed");
	}

}
