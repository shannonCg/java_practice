package overload;

//當多載函式同時存在var-args和widening類型，則JVM會以widening為優先選擇
//(由於放寬機制早已存在，所以為了向下相容才以放寬機制為優先選擇)
public class WideningVsVarargs {

	//var-args
	static void go(byte... x){
		System.out.println("byte...");
	}
	
	//widening
	static void go(int x, int y){
		System.out.println("int,int");
	}
	
	public static void main(String[] args){
		byte b = 5;
		go(b, b);
	}
}
