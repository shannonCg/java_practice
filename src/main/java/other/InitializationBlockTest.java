package other;

public class InitializationBlockTest {

	public static void main(String[] args){
		new Son();
		System.out.println("------------------------------------");
		new Son(1);
	}
}

class Father{
	public Father(){
		System.out.println("This is father constructor");
	}
}

class Son extends Father{
	//static initialization block
	//執行時機:類別被第一次載入時執行，所以只會執行一次
	static{
		System.out.println("This is son 1st static initialization block");
	}
	//instance initialization block
	//執行時機:每次建立一個實體就執行一次，且在建構子呼叫super()之後才執行
	{
		System.out.println("This is son 1st instance initialization block");
	}
	
	{
		System.out.println("This is son 2nd instance initialization block");
	}
	static{
		System.out.println("This is son 2nd static initialization block");
	}
	
	public Son(){
		System.out.println("This is son no-arg constructor");
	}
	
	public Son(int x){
		System.out.println("This is son 1-arg constructor");
	}
}