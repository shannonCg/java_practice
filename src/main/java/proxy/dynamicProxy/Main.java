package proxy.dynamicProxy;

public class Main {

	public static void main(String[] args) {
		LogHandler handler = new LogHandler();
		
		IHello proxy = (IHello) handler.bind(new HelloSpeaker());
		proxy.hello("Shannon");
	}

}
