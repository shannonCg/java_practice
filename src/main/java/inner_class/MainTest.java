package inner_class;

public class MainTest {

	public static void main(String[] args) {
		//Simple Inner Class Test
		//在外部類別內實體化內隱類別
		SimpleInnerClass simpleInner = new SimpleInnerClass();
		simpleInner.makeInner();
		//在外部類別外實體化內隱類別
		SimpleInnerClass.MyInner simpleInner2 = new SimpleInnerClass().new MyInner();
		simpleInner2.seeOuter();
		//呼叫this的方式
		simpleInner2.callThisInInner();
	}

}
