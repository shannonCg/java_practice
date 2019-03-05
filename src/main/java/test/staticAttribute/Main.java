package test.staticAttribute;

public class Main {

	public static void main(String[] args) {
		Parent.printFrom();
		Child.printFrom();
		AnotherChild.printFrom();
		
		System.out.println("-----------------------------");
		
		Parent child = new Child();
		child.printFrom();
		
		Parent anotherChild = new AnotherChild();
		anotherChild.printFrom();
		
		System.out.println("-----------------------------");
		
		Child child2 = new Child();
		child2.printFrom();
		
		AnotherChild anotherChild2 = new AnotherChild();
		anotherChild2.printFrom();
		
	}

}
