package overload;

//多載的基本型態范寬機制: 選擇比傳入的參數型別更寬但範圍最小的多載引數型別
public class Widening {

	//if we commend go(int x) and go(long x), JVM will all call go(double x) function as result.
	static void go(int x){
		System.out.println("int");
	}
	static void go(long x){
		System.out.println("long");
	}
	static void go(double x){
		System.out.println("double");
	}
	
	public static void main(String[] args){
		byte b = 5;
		short s = 5;
		long l = 5;
		float f = 5.0f;
		
		go(b);
		go(s);
		go(l);
		go(f);
	}

}
