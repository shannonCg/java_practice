package collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("a", "ant");
		map.put("d", "dog");
		map.put("h", "horse");
		
		SortedMap<String, String> submap = map.subMap("b", "g");
		System.out.println("map:"+map+", submap(sub map from key b to g):"+submap);
		
		map.put("b", "bat"); 
		submap.put("f", "fish");
		System.out.println("map:"+map+", submap(sub map from key b to g):"+submap);
		
		//加入超出subMap條件範圍的key-value
		map.put("r", "raccon");
//		submap.put("p", "pig");//throw illegalArgumentException: key out of range
		System.out.println("map:"+map+", submap(sub map from key b to g):"+submap);
	}

}
