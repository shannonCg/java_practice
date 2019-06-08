package test_simple;

public class BoxingTest {
	//當兩個相同類別的外覆類別實體透過boxing所產生，為了節省記憶體的使用會共用同一個物件，但只限定:
	//Boolean, Byte, Character且範圍是\u0000到\u007f(7f的十進位是127), Short和Integer且範圍是-128到127

	public static void main(String[] args){
		Integer num1 = 127;
		Integer num2 = 127;
		if(num1 != num2){
			System.out.println("different object");
		}
		if(num1.equals(num2)){
			System.out.println("meaningfully equal");
		}
		System.out.println("-----------------");
		
		Integer num5 = new Integer(127);
		Integer num6 = new Integer(127);
		if(num5 != num6){
			System.out.println("different object");
		}
		if(num5.equals(num6)){
			System.out.println("meaningfully equal");
		}
		System.out.println("-----------------");
		
		Integer num3 = 128;
		Integer num4 = 128;
		if(num3 != num4){
			System.out.println("different object");
		}
		if(num3.equals(num4)){
			System.out.println("meaningfully equal");
		}
		System.out.println("-----------------");
		
		Integer num7 = 11;
		Integer num8 = num7;
		System.out.println("num7="+num7+", num8="+num8);
		System.out.println("num7==num8?"+Boolean.toString(num7==num8));
		num7++;
		System.out.println("num7="+num7+", num8="+num8);
		System.out.println("num7==num8?"+Boolean.toString(num7==num8));
	}
}
