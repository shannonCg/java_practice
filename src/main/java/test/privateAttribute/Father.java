package test.privateAttribute;

public abstract class Father {
	private String name1 = "hihi";
	
	protected abstract void printHello();
	
	public void printAll(){
		this.printHello();
		System.out.println(name1);
	}
}
