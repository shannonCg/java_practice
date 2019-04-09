package other;

public class IfStatement {

	public static void main(String[] args) {
		int x = 3;
		int y = 0;
		int z = 0;
		int a = 0;

		// style 1(good)
		if (x > 3) {
			y = 2;
		}
		z = 8;
		a = y + z;
		System.out.println("a= " + a);
		System.out.println();

		// style 2(bad)
		if (x > 3)
			y = 2;
			z = 8;
			a = y + z;
		System.out.println("a= " + a);
		System.out.println();
		
	}

}
