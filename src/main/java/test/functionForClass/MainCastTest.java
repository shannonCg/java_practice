package test.functionForClass;

public class MainCastTest {

	public static void main(String[] args) {
		CastTest favs = new CastTest();
		favs.put(String.class, "Hello");
		System.out.println(favs.get(String.class));

	}

}
