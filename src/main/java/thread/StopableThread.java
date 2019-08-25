package thread;

public class StopableThread implements Runnable {

	private boolean doStop = false;
	
	public synchronized void doStop(){
		this.doStop = true;
	}
	
	private synchronized boolean keepRunning(){
		return this.doStop == false;
	}
	
	@Override
	public void run() {
		while(keepRunning()){
			//keep doing what this thread should do
			System.out.println("Running...");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
