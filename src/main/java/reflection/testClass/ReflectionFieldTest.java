package reflection.testClass;

public class ReflectionFieldTest {
	public enum Test{
		TRUE,FALSE;
	}
	
	public long chapter = 0;
	private String[] characters = {"Alice", "White Rabbit"};
	Test isTest = Test.FALSE;
	public String[] getCharacters() {
		return characters;
	}
	public void setCharacters(String[] characters) {
		this.characters = characters;
	}
	public Test getIsTest() {
		return isTest;
	}
	public void setIsTest(Test isTest) {
		this.isTest = isTest;
	}
	
}
