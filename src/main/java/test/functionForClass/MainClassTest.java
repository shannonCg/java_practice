package test.functionForClass;

public class MainClassTest extends ClassOperation<ClassPojo, String> {
	
	public MainClassTest(Class<ClassPojo> cs){
		super(cs);
	}
	
	public static void main(String[] args) {
		ClassPojo target = new ClassPojo();
		MainClassTest test = new MainClassTest((Class<ClassPojo>) target.getClass());
		System.out.println(test.getSimpleName());
		System.out.println(test.getName());
		System.out.println(test.getTypeName());
		System.out.println(test.getCanonicalName());
		
		String[] aa = {"1","2","3"};
		System.out.println(aa.getClass().getSimpleName());
		System.out.println(aa.getClass().getName());
		System.out.println(aa.getClass().getTypeName());
		System.out.println(aa.getClass().getCanonicalName());
		
		String bb = "100";
		System.out.println(bb.getClass().getSimpleName());
		System.out.println(bb.getClass().getName());
		System.out.println(bb.getClass().getTypeName());
		System.out.println(bb.getClass().getCanonicalName());
		
		int[] cc = {1,2,3};
		System.out.println(cc.getClass().getSimpleName());
		System.out.println(cc.getClass().getName());
		System.out.println(cc.getClass().getTypeName());
		System.out.println(cc.getClass().getCanonicalName());
	}

}
