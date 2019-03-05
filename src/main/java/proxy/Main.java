package proxy;

import java.lang.reflect.Method;

import proxy.annotation.ClassName;

public class Main {

	public static void main(String[] args) {
		MethodTest methodTest = MethodTestProxy.newInstance(new MethodTestImp());
		methodTest.sayHello("Jhon", "hihi");
		MethodTestImp testImp = new MethodTestImp();
		for(Method method : testImp.getClass().getMethods()){
			if(method.getName().equals("sayHello")){
				Class<?> resourceClass = method.getDeclaringClass();
				if(resourceClass.isAnnotationPresent(ClassName.class)){
					System.out.println("@ClassName value is "+resourceClass.getAnnotation(ClassName.class).value());
				}
			}
		}
	}
	
}
