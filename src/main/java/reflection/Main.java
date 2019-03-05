package reflection;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Main {

	public static void main(String[] args) {
		Type[] types = Test.class.getGenericInterfaces();
		
		System.out.println("=========getGenericInterfaces=========");
		for(Type type : types){
			System.out.println(type);
			
			if(ParameterizedType.class.isAssignableFrom(type.getClass())){
				System.out.println("------------->getActualTypeArguments:");
				ParameterizedType pts = (ParameterizedType)type;
				
				for(Type t : pts.getActualTypeArguments()){
					System.out.print(t.getTypeName()+", ");
				}
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("==========getInterfaces========");
		for(Class c : Test.class.getInterfaces()){
			System.out.println(c.getName());
		}
		
		
		
	}

}
