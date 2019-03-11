package enumTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTest {

	public static void main(String[] args) {
		
		//test1
		for(Day day: Day.values()){
			System.out.println(day.name());
		}
		System.out.println("----------------------------------");
		
		//test2
		for(DayAdvanced day: DayAdvanced.values()){
			System.out.println("name:" + day.name() + "\tvalue:" + day.getValue());
		}
		System.out.println("----------------------------------");
		
		//test3
        UseEnum firstDay = new UseEnum(Day.MONDAY);
        firstDay.tellItLikeItIs();
        UseEnum thirdDay = new UseEnum(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        UseEnum sixthDay = new UseEnum(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        UseEnum seventhDay = new UseEnum(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
        System.out.println("----------------------------------");
        
        //test4
        List<Day> list = Arrays.asList(Day.values());
        System.out.println(list);
        int index = list.indexOf(Day.MONDAY);
        System.out.println(index);
//        list.remove(index); //compile error because array can't be removed
//        System.out.println(list);
        List<String> list2 = Arrays.asList("hello", "hi", "may");
        System.out.println(list2);
//        list2.remove(0);   //compile error because array can't be removed
//        System.out.println(list2);
        
        List<Day> days = Stream.of(Day.MONDAY, Day.SATURDAY)
        						.collect(Collectors.toList());
        System.out.println(days);
        int dayIndex = days.indexOf(Day.MONDAY);
        System.out.println(dayIndex);
        days.remove(dayIndex); 
        System.out.println(days);
        System.out.println("----------------------------------");
        
        //test5
        String comment = DayAdvanced.MONDAY.getComment();
        System.out.println(comment);
        String comment2 = DayAdvanced.SUNDAY.getComment();
        System.out.println(comment2);
        String comment3 = DayAdvanced.SATURDAY.getComment();
        System.out.println(comment3);
	}

}
