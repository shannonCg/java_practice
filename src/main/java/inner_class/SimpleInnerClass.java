package inner_class;

public class SimpleInnerClass {

	private int x = 7;
	
	public void makeInner(){
		MyInner inner = new MyInner();
		inner.seeOuter();
	}
	
	public class MyInner{
		public void seeOuter(){
			System.out.println("Outer x is "+x);
		}
		
		public void callThisInInner(){
			// call inner class instance by 'this'
			System.out.println("Inner class ref is "+this);
			// call outer class instance by 'className.this'
			System.out.println("Outer class ref is "+SimpleInnerClass.this);
		}
	}
}
