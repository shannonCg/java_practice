package overload;

//當多載函式同時存在boxing和var-args類型，則JVM會以boxing為優先選擇
public class AutoboxingVsVarargs {

	static void go(Byte x, Byte y){
		System.out.println("Byte,Byte");
	}
	
	static void go(byte... x){
		System.out.println("byte...");
	}
	
	public static void main(String[] args) {
		byte b = 5;
		go(b, b);
	}

}
