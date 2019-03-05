package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 資料的轉換：若有一個方法會將某輸入資料(input)轉換成另一個資料輸出(output)時，可以使用map方法
 * map(T -> T)
 */
public class Map {

	public static void main(String[] args) {
		// original solution
		List<String> names = new ArrayList<>();
		for(String name : Arrays.asList("tony", "tom", "john")){
			String upperName = name.toUpperCase();
			names.add(upperName);
		}
		System.out.println(names.toString());
		
		// use lambda to rewrite the solution
		List<String> names2 = Stream.of("tony", "tom", "john")
									.map(name -> name.toUpperCase())
									.collect(Collectors.toList());
		System.out.println(names2.toString());
	}

}
