package overload;

//當多載函式同時存在boxing和widening類型，則JVM會以widening為優先選擇
//(由於放寬機制早已存在，所以為了向下相容才以放寬機制為優先選擇)
public class WideningVsAutoboxing {
	
	//boxing
	static void go(Integer x){
		System.out.println("Integer");
	}
	
	//widening
	static void go(long x){
		System.out.println("long");
	}
	public static void main(String[] args) {
		int i = 5;
		go(i);
	}

}
