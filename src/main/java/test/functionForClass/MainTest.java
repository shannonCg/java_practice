package test.functionForClass;

import java.lang.reflect.Field;
import java.util.*;

public class MainTest extends TestStaticName{
	public void doSomething(){
		Field[] fields = super.getClass().getFields();
		for(Field f : fields){
			String name = f.getName();
			System.out.println("field name is "+name);
			System.out.println("field type is "+f.getGenericType().getTypeName());
			try {
				System.out.println("field value is "+f.get(name));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println();
		}
	}
	
	public void change1(List<String> ls){
		ls.add("happy");
		System.out.println();
	}
	
	public List<String> change2(List<String> ls){
		ls.add("angry");
		System.out.println();
		return ls;
	}
	
	
	public static void main(String[] args) {
		//test Class and Type
		MainTest ts = new MainTest();
		ts.doSomething();
		
		//test function
		List<String> ls = new ArrayList<String>(Arrays.asList("aa","bb","cc"));
		
		for(Object o : ls){
			System.out.println(o);
		}
		
		ts.change1(ls);
		for(Object o : ls){
			System.out.println(o);
		}
		
		ts.change2(ls);
		for(Object o : ls){
			System.out.println(o);
		}

	}

}
