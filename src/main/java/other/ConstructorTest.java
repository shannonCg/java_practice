package other;

public class ConstructorTest {

	public static void main(String[] args){
		new Son();
	}
}

class Father{
	public Father(){
		System.out.println("This is father constructor");
	}
}

class Son extends Father{
	static{
		System.out.println("This is son static function");
	}
	
	public Son(){
		System.out.println("This is son constructor");
	}
}