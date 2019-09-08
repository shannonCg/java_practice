package collection;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> times = new TreeSet<>();
		times.add(1205);
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2100);
		
		System.out.println("last before 4pm(1600) is: "+times.lower(1600));
		System.out.println("first after 8pm(2000) is: "+times.higher(2000));
	}

}
