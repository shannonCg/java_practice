package thread;

public class Main_PauseThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(3000l);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("execute thread 1");
		});
		Thread t2 = new Thread(() -> {
			System.out.println("execute thread 2");
		});
		
		t1.start();
		t2.start();
	}

}
