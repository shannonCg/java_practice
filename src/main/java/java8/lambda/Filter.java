package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 資料的篩選：若要用迴圈去篩選元素時，可以使用filter
 * filter(T -> boolean)
 */
public class Filter {

	public static void main(String[] args) {
		// original solution
		List<String> names = new ArrayList<>();
		for (String name : Arrays.asList("tony", "tom", "john")) {
			if (name.startsWith("t")) {
				names.add(name);
			}
		}
		System.out.println(names.toString());

		// use lambda to rewrite the solution
		List<String> names2 = Stream.of("tony", "tom", "john")
									.filter(name -> name.startsWith("t"))
									.collect(Collectors.toList());
		System.out.println(names2.toString());

	}

}
