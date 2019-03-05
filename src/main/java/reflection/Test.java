package reflection;

public class Test implements TestA, TestB, TestC<String, Integer> {
	
	private String a = "hihi";
	
	private int b = 1;

	@Override
	public String getA() {
		return a;
	}

	@Override
	public Integer getB() {
		return b;
	}

	@Override
	public String print() {
		return "test";
	}

	@Override
	public void sayHi() {
		System.out.println("hello~");
	}

}
