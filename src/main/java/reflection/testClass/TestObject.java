package reflection.testClass;

public class TestObject {
	
	@EnumFormat(allowClazz=TestEnum.class)
	private String test;
	
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}

}
