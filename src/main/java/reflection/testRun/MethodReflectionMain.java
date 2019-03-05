package reflection.testRun;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import reflection.testClass.MethodValidate;
import reflection.testClass.ParamValidate;
import reflection.testClass.ReflectionMethodTest;

public class MethodReflectionMain {

	public static void main(String[] args) {
		ReflectionMethodTest methodTest = new ReflectionMethodTest();
		
		Class<?> reflectionTest = methodTest.getClass();
		List<Method> methods = Arrays.asList(reflectionTest.getDeclaredMethods());
		
		//find method which has the annotation
		System.out.print("find the method which has the annotation[@MethodValidate]:");
		methods.stream()
			 	.filter(method -> method.isAnnotationPresent(MethodValidate.class))
			 	.forEach(method -> {
			 		System.out.println(method.getName());
			 		System.out.println("execuate the method :");
			 		try {
						method.invoke(methodTest);
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
			 	});
		
		//find the parameter in the method which has the annotation 
		System.out.println("find the parameter in the method has the annotation[@ParamValidate]:");
		methods.stream()
				.flatMap(method -> Arrays.stream(method.getParameters()))
				.filter(parameter -> parameter.isAnnotationPresent(ParamValidate.class))
				.forEach(parameter -> {
					System.out.println("type: "+parameter.getType());
					System.out.println("name: "+parameter.getName());
				});
	}

}
