package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				new Student("1", 50, "AA"),
				new Student("1", 30, "AA"),
				new Student("2", 50, "AA"),
				new Student("3", 50, "BB"),
				new Student("4", 30, "BB"),
				new Student("5", 50, "CC")
				);
		
		 Map<String, Long> countById = students.stream()
				 								.collect(Collectors.groupingBy(Student::getId, Collectors.counting()));
		 countById.forEach((key, value) -> System.out.println("sutdentId="+key+", count="+value));
		 
		 Map<String, Integer> sumById = students.stream()
				 							 .collect(Collectors.groupingBy(Student::getId, Collectors.summingInt(Student::getGrade)));
		 System.out.println(sumById);
		 sumById.forEach((key, value) -> System.out.println("sutdentId="+key+", sum grade="+value));
		 
		 Map<String, Map<String, Integer>> classStudentGrade = students.stream()
				 														.collect(Collectors.groupingBy(Student::getClassId, Collectors.groupingBy(Student::getId, Collectors.summingInt(Student::getGrade))));
		 classStudentGrade.forEach((key, value) -> value.forEach((key2, value2) -> System.out.println("classId="+key+", sutdentId="+key2+", sum grade="+value2)));
		 Map<String, Integer> studentGrade = classStudentGrade.get("AA");
		 studentGrade.forEach((key, value) -> System.out.println("sutdentId="+key+", sum grade="+value));
		 
		 Map<String, Set<String>> classSutdent = students.stream()
				 										  .collect(Collectors.groupingBy(Student::getClassId, Collectors.mapping(Student::getId, Collectors.toSet())));
		 classSutdent.forEach((key, value) -> System.out.println("classId="+key+", students="+value));
		 
	}

}
