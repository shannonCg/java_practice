package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import proxy.annotation.ClassName;
import proxy.annotation.MethodName;
import proxy.annotation.MethodParamName;

public class MethodTestProxy implements InvocationHandler {
	
	private Object obj;
	
	public MethodTestProxy(Object obj){
		this.obj = obj;
	}
	
	@SuppressWarnings("unchecked")
	public static<T> T newInstance(T obj){
		return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader()
				, obj.getClass().getInterfaces(), new MethodTestProxy(obj));
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("start invocation ...");
		Arrays.asList(method.getAnnotations()).stream().forEach(anno -> System.out.println("*"+anno.toString()));
		Class<?> resourceClass = method.getDeclaringClass();
		if(resourceClass.isAnnotationPresent(ClassName.class)){
			System.out.println("@ClassName value is "+resourceClass.getAnnotation(ClassName.class).value());
		}
		if(method.isAnnotationPresent(MethodName.class)){
			System.out.println("@MethodName value is "+method.getAnnotation(MethodName.class).value());
		}
		Parameter[] params = method.getParameters();
		for(int i = 0 ; i < params.length ; i++){
			if(params[i].isAnnotationPresent(MethodParamName.class)){
				System.out.println("@MethodParamName value is "+params[i].getAnnotation(MethodParamName.class).value());
				args[i] = params[i].getAnnotation(MethodParamName.class).value();
			}
		}
		method.invoke(obj, args);
		return null;
	}

}
