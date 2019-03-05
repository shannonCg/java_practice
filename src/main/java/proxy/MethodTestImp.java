package proxy;

import proxy.annotation.ClassName;
import proxy.annotation.MethodName;
import proxy.annotation.MethodParamName;

@ClassName("MethodTestImp")
public class MethodTestImp implements MethodTest {

	@Override
	@MethodName("sayHello")
	public void sayHello(String name,@MethodParamName("hello~") String helloMessage) {
		System.out.println(helloMessage+", "+name);
	}

}
