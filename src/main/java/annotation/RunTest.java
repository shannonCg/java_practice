package annotation;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RunTest {

	public static void main(String[] args) {
		
		System.out.println("testing ...");
		
		int passed = 0, failed = 0, count = 0, ignore = 0;
		
		Class<TestExample> obj = TestExample.class;
		
		//Process @TestInfo
		if(obj.isAnnotationPresent(TestInfo.class)){
			TestInfo testInfo = obj.getAnnotation(TestInfo.class);
			System.out.printf("%nPriority :%s", testInfo.priority());
			System.out.printf("%nCreatedBy :%s", testInfo.createBy());
//			String tags = Arrays.asList(testInfo.tags()).stream()
//														 .map(tag -> tag+", ")
//														 .reduce((result, tag) -> result += tag)
//														 .get();
//			System.out.printf("%nTags :%s", tags.substring(0, tags.length()-2));
			String tags = Arrays.asList(testInfo.tags()).stream()
														.collect(Collectors.joining(", "));
			System.out.printf("%nTags :%s", tags);
			
			System.out.printf("%nLastModified :%s%n%n", testInfo.lastModified());
		}
		
		//Process @Test
		for(Method method : obj.getDeclaredMethods()){
			if(method.isAnnotationPresent(Test.class)){
				Test test = method.getAnnotation(Test.class);
				
				if(test.enable()){
					try{
						method.invoke(obj.newInstance());
						System.out.printf("%s - Test '%s' -passed %n", ++count, method.getName());
						passed++;
					}catch(Throwable ex){
						System.out.printf("%s - Test '%s' -failed: %s %n", ++count, method.getName(), ex.getCause());
						failed++;
					}
				}else{
					System.out.printf("%s - Test '%s' -ignored %n", ++count, method.getName());
					ignore++;
				}
			}
		}
		
		System.out.printf("Result: Total: %d, Passed: %d, Failed: %d, Ignore: %d%n", count, passed, failed, ignore);
	}

}
