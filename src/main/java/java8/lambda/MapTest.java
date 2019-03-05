package java8.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new ConcurrentHashMap<>();
		map1.put("1", 10);
		map1.put("2", 50);
		map1.put("3", 30);
		
		Map<String, Integer> map2 = new ConcurrentHashMap<>();
		map2.put("1", 10);
		map2.put("2", 50);
		map2.put("3", 30);
		
		Map<String, Integer> map3 = Stream.of(map1, map2)
										  .map(Map::entrySet)
										  .flatMap(Collection::stream)
										  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Integer::sum));
		System.out.println(map3);
		map3.forEach((key, value) -> System.out.println("key="+key+", value="+value));
		
		List<Student> students = Arrays.asList(
				new Student("1", 50, "AA"),
				new Student("2", 50, "AA"),
				new Student("3", 50, "BB"),
				new Student("4", 30, "BB"),
				new Student("5", 50, "CC")
				);
		Map<String, String> student = students.stream()
											  .collect(Collectors.toMap(Student::getId, Student::getClassId));
		student.forEach((key, value)-> System.out.println("studentId="+key+", classId="+value));
				
	}
}
