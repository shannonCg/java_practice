package concurrentThread;

public class CountValue {
	
	private static final CountAddition countAddition = new CountAddition();
	
	public static int getResult(int num){
		return countAddition.addition(num, 1);
	}
	
}
