package proxy.staticProxy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloProxy implements IHello {
	
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	private IHello helloObject;
	
	public HelloProxy(IHello helloObject){
		this.helloObject = helloObject;
	}
	
	@Override
	public void hello(String name) {
		
		log("hello method starts...");
		helloObject.hello(name);
		log("hello method ends...");
	}
	
	private void log(String msg){
		logger.log(Level.INFO, msg);
	}

}
