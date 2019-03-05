package proxy.withAnnotationProxy;

import proxy.withAnnotationProxy.annotation.ClassName;
import proxy.withAnnotationProxy.annotation.MethodName;
import proxy.withAnnotationProxy.annotation.MethodParamName;

@ClassName("MethodTestImp")
public class MethodTestImp implements MethodTest {

	@Override
	@MethodName("sayHello")
	public void sayHello(String name,@MethodParamName("hello~") String helloMessage) {
		System.out.println(helloMessage+", "+name);
	}

}
