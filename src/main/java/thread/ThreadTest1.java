package thread;

public class ThreadTest1 extends Thread {

	public ThreadTest1(String threadName){
		super(threadName);
	}
	@Override
	public void run(){
		System.out.println("Thread ["+getName()+"] executed");
	}
}
