package test.functionForClass;

import java.util.HashMap;
import java.util.Map;

/*
 * the use of reflection
 */

public class CastTest {
	private Map<Class<?>, Object> map = new HashMap<Class<?>, Object>();
	
	public <T> T get(Class<T> clazz){
		return clazz.cast(map.get(clazz));
	}
	
	public <T> void put(Class<T> clazz, T favorite){
		map.put(clazz,favorite);
	}
}
