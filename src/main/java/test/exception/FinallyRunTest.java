package test.exception;

public class FinallyRunTest {

	public static void main(String[] args){
		
		FinallyTest test = new FinallyTest();
		String word = "";
		
		word = test.getWord1();
		System.out.println("[main] word:"+word);
		System.out.println();
		
		word = test.getWord2();
		System.out.println("[main] word:"+word);
		System.out.println();
		
		word = test.getWord3();
		System.out.println("[main] word:"+word);
		System.out.println();
	}
	
	static class FinallyTest{
		//finally的執行順序在return動作執行之後、返回回傳值之前
		public String getWord1(){
			String word = "A";
			try{
				System.out.println("[try] word:"+word);
				throw new NullPointerException();
			}catch(RuntimeException ex){
				word = "B";
				System.out.println("[catch] word:"+word);
				return returnAction();
			}finally{
				word = "D";
				System.out.println("[finally] word:"+word);
			}
		}
		
		private String returnAction(){
			String word = "C";
			System.out.println("[return function] word:"+word);
			return word;
		}
		
		//由於finally的執行順序在return動作執行之後、返回回傳值之前，且return的返回值會保留
		//，所以在finally區塊更改變數值不會改變回傳值
		public String getWord2(){
			String word = "A";
			try{
				System.out.println("[try] word:"+word);
				throw new NullPointerException();
			}catch(RuntimeException ex){
				word = "B";
				System.out.println("[catch] word:"+word);
				return word;
			}finally{
				word = "D";
				System.out.println("[finally] word:"+word);
			}
		}
		
		public String getWord3(){
			String word = "A";
			try{
				System.out.println("[try] word:"+word);
				throw new NullPointerException();
			}catch(RuntimeException ex){
				word = "B";
				System.out.println("[catch] word:"+word);
				return word;
			}finally{
				word = "D";
				System.out.println("[finally] word:"+word);
				return word;
			}
		}
	}
	
}
