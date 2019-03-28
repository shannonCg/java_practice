package test.override;

public class Father {
	private void sayWords(){
		System.out.println("I am Father");
	}
	
	public static void main(String[] args) {
		Father father = new Child();
		father.sayWords();
		Father father2 = new Father();
//		father2.sayWords();
	}
}
