package enumTest;

import java.util.Arrays;
import java.util.List;

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
        
        //test4
        List<Day> list = Arrays.asList(Day.values());
        System.out.println(list);
        int index = list.indexOf(Day.MONDAY);
        System.out.println(index);
//        list.remove(index);
//        System.out.println(list);
        List<String> list2 = Arrays.asList("hello", "hi", "may");
        System.out.println(list2);
        list2.remove(0);
        System.out.println(list2);
	}

}
