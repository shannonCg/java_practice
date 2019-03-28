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
		//finally�����涶�Ǧbreturn�ʧ@���椧��B��^�^�ǭȤ��e
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
		
		//�ѩ�finally�����涶�Ǧbreturn�ʧ@���椧��B��^�^�ǭȤ��e�A�Breturn����^�ȷ|�O�d
		//�A�ҥH�bfinally�϶�����ܼƭȤ��|���ܦ^�ǭ�
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
