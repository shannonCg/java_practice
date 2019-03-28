package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * produce collection
 */
public class Collect {

	public static void main(String[] args) {
		// original solution
		List<String> name1 = Arrays.asList("Tony", "Tom", "Jonn");
		System.out.println(name1.toString());
		
		// use lambda to rewrite the solution
		List<String> name2 = Stream.of("Tony", "Tom", "Jonn").collect(Collectors.toList());
		System.out.println(name2.toString());
		
		Set<String> name3 = Stream.of("Tony", "Tony", "Tom", "Jonn").collect(Collectors.toSet());
		System.out.println(name3.toString());
	}	

}
