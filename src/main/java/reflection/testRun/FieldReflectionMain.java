package reflection.testRun;

import java.lang.reflect.Field;
import java.util.Arrays;

import reflection.testClass.ReflectionFieldTest;
import reflection.testClass.ReflectionFieldTest.Test;

public class FieldReflectionMain {
	
	public static void main(String[] args) {
		ReflectionFieldTest reflectionTest = new ReflectionFieldTest();
		String fmt = "%6S: %-12s = %s%n";
		
		Class<?> c = reflectionTest.getClass();
		
		//field: chapter
		try {
			Field chapter = c.getField("chapter");
			System.out.format(fmt, "before", "chapter", reflectionTest.chapter);
			chapter.set(reflectionTest, 1);
			System.out.format(fmt, "after", "chapter", chapter.get(reflectionTest));
			System.out.format(fmt, "after", "chapter", reflectionTest.chapter);
			System.out.println();

			//field: characters
			Field characters = c.getDeclaredField("characters");
			characters.setAccessible(true);
			System.out.format(fmt, "before", "characters", Arrays.asList(reflectionTest.getCharacters()));
			String[] newCharacters = {"Queen","King"};
			characters.set(reflectionTest, newCharacters);
			System.out.format(fmt, "after", "characters", Arrays.asList((String[])characters.get(reflectionTest)));
			System.out.format(fmt, "after", "characters", Arrays.asList(reflectionTest.getCharacters()));
			System.out.println();
			
			//field: isTest
			Field isTest = c.getDeclaredField("isTest");
			isTest.setAccessible(true);
			System.out.format(fmt, "before", "isTest", reflectionTest.getIsTest());
			isTest.set(reflectionTest, Test.TRUE);
			System.out.format(fmt, "after", "isTest", isTest.get(reflectionTest));
			System.out.format(fmt, "after", "isTest", reflectionTest.getIsTest());
			System.out.println();
		} catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}
}
