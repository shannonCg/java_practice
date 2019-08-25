package thread;

public class Main_StopThread {

	public static void main(String[] args) {
		StopableThread r1 = new StopableThread();
		Thread t1 = new Thread(r1);
		
		t1.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		r1.doStop();
	}

}
