package other;

public class DefaultValueTest {

	static int[] years = new int[10];
	static String[] words = new String[10];
	
	static int year;
	static String word;
	static int[] years1;
	static String[] words1;
	
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			System.out.print("year:"+years[i]+" ");
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++){
			System.out.print("word:"+words[i]+" ");
		}
		System.out.println();
		
		int year2;
		System.out.println("year:"+year);
//		System.out.println("year:"+year2); //compile fail, because local variable haven't been initialized automatically
		
		String word2;
		System.out.println("word:"+word);
//		System.out.println("word2:"+word2); //compile fail, because local variable haven't been initialized automatically
		
		int[] years2;
		System.out.println("years1:"+years1);
//		System.out.println("years2:"+years2); //compile fail, because local variable haven't been initialized automatically
		
		String[] words2;
		System.out.println("words1:"+words1);
//		System.out.println("words2:"+words2); //compile fail, because local variable haven't been initialized automatically
		
		String[] test1 = {"aaa","bbb"};
		for(String test: test1){
			System.out.print(test+" ");
		}
		System.out.println();
		
		//匿名陣列建構和初始化
		for(String test: new String[]{"ccc", "ddd"}){
			System.out.print(test+" ");
			
		}
		
		
	}
	
}
