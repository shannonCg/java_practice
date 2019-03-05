package proxy.staticProxy;

public class Main {

	public static void main(String[] args) {
		IHello proxy = new HelloProxy(new HelloSpeaker());
		proxy.hello("Shannon");
	}

}
