package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CollectionsTest {
	
	public <T> List<T> intersect(List<T> ls1, List<T> ls2){
		List<T> list = new ArrayList<>(ls1);
		list.retainAll(ls2);
		return list;
	}
	
	public <T> List<T> diff(List<T> ls1, List<T> ls2){
		List<T> list = new ArrayList<>(ls1);
		list.removeAll(ls2);
		return list;
	}
	
	public <T> List<T> union(List<T> ls1, List<T> ls2){
		List<T> list = new ArrayList<>(ls1);
		list.addAll(ls2);
		list = new ArrayList<>(new HashSet<>(list));
		return list;
	}

	public static void main(String[] args) {
		List<Long> list1 = Arrays.asList((long)1,(long)2,(long)3);
		List<Long> list2 = Arrays.asList((long)3,(long)4,(long)5);
		
		CollectionsTest collect = new CollectionsTest();
		//並集
		List<Long> inter = collect.intersect(list1, list2);
		System.out.println(inter);
		//差集
		List<Long> diff = collect.diff(list1, list2);
		System.out.println(diff);
		//交集
		List<Long> union = collect.union(list1, list2);
		System.out.println(union);
	}

}
