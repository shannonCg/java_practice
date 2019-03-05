package reflection.testClass;

public class ReflectionMethodTest {
	
	public void testMethod(@ParamValidate String text){
		System.out.println(text);
	}
	
	@MethodValidate
	public void sayHi(){
		System.out.println("Hello~~");
	}
}
