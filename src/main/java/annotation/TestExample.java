package annotation;

import annotation.TestInfo.Priority;

@TestInfo(
		priority = Priority.High,
		createBy = "test",
		tags = {"sales", "test"}
)
public class TestExample {

	@Test
	void testA(){
//		throw new RuntimeException("This test always failed");
	}
	
	@Test(enable = false)
	void testB(){
		throw new RuntimeException("This test always failed");
	}
	
	@Test(enable = true)
	void testC(){
		throw new RuntimeException("This test always failed");
	}
	
	void testD(){
		throw new RuntimeException("This test always failed");
	}
}
