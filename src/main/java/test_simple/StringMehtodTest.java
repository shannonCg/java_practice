package test_simple;

import java.util.Objects;

public class StringMehtodTest {

	public static void main(String[] args) {
		// String method: regionMatches
		String aa = "tags";
		String bb = "tags%5B%5D";
		if (aa.regionMatches(false, 0, bb, 0, 4)) {
			System.out.println(" \"tags\" and \"tags%5B%5D\" are partial match");
		} else {
			System.out.println(" \"tags\" and \"tags%5B%5D\" are not partial match");
		}
		System.out.println("--------------------");
		
		// String method: match
		String format = "[\\x20-\\x7e]*";
		String testA = "ai!~`390\\?><";
		if (testA.matches(format)) {
			System.out.println("match");
		}
		System.out.println("--------------------");

		// String method: endsWith
		String cc = "fileExt%5B%5D";
		if (cc.endsWith("%5B%5D")) {
			System.out.println("the index of \"%5B%5D\" is " + cc.indexOf("%5B%5D"));
			System.out.println("trim the string \"%5B%5D\"");
			System.out.println(cc.substring(0, cc.indexOf("%5B%5D")));
			System.out.println(cc);
		} else {
			System.out.println("nothing happened");
		}
		System.out.println("--------------------");

		// equalsIgnoreCase
		String e = "aBk";
		if ("ABK".equalsIgnoreCase(e)) {
			System.out.println("ignore case");
		} else {
			System.out.println("non ignore case");
		}
		System.out.println("--------------------");

		// String method: toLowerCase
		String f = "sbd%5B%5D";
		System.out.println(f.toLowerCase());
		System.out.println("--------------------");

		// String method: substring
		String testStr = "AAAb";
		testStr = testStr.substring(0, testStr.length() - 1);
		System.out.println(testStr);
		System.out.println("--------------------");

		// String method: isEmpty
		String a = "";
		if (a.isEmpty()) {
			System.out.println("it is empty string");
		}
		String b = null;
		if (Objects.nonNull(b) && b.isEmpty()) {
			System.out.println("it is empty string");
		}

	}

}
