package java8.lambda;

import java.util.stream.IntStream;

/*
 * for迴圈
 */
public class ForEach {

	public static void main(String[] args) {
		// original solution
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("----------------------");

		// use lambda to rewrite the solution
		IntStream.range(0, 10).forEach(i -> System.out.println(i));
		System.out.println("----------------------");
		IntStream.range(0, 10).forEach(System.out::println);
	}

}
