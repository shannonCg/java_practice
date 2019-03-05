package reflection.testRun;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import reflection.testClass.EnumFormat;
import reflection.testClass.TestObject;

public class EnumAnnotationReflectionMain {

	public static void main(String[] args) {
		TestObject obj1 = new TestObject();
		obj1.setTest("enable");

		TestObject obj2 = new TestObject();
		obj2.setTest("DISABLE");

		TestObject obj3 = new TestObject();
		obj3.setTest("test");

		List<TestObject> objs = new ArrayList<>();
		objs.add(obj1);
		objs.add(obj2);
		objs.add(obj3);

		Class<TestObject> testObject = TestObject.class;
		List<Field> fields = Arrays.stream(testObject.getDeclaredFields())
				.filter(fd -> fd.isAnnotationPresent(EnumFormat.class)).peek(fd -> fd.setAccessible(true))
				.collect(Collectors.toList());

		for (TestObject obj : objs) {
			for (Field field : fields) {
				EnumFormat enumAnnotation = field.getAnnotation(EnumFormat.class);
				Arrays.stream(enumAnnotation.allowClazz().getEnumConstants()).filter(em -> {
					try {
						return em.toString().equals(field.get(obj).toString());
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
					return false;
				}).forEach(em -> System.out.println(em));

			}
		}

	}
}
