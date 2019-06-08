package test_simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {

		// List to LinkedHashSet
		List<String> list = Arrays.asList("aaa", "bbb", "ccc", "aaa");
		for (String ss : list) {
			System.out.println(ss);
		}
		System.out.println("-----------");

		LinkedHashSet<String> lhs = new LinkedHashSet<String>(list);
		for (String ss : lhs) {
			System.out.println(ss);
		}
		System.out.println("-----------");

		list = new ArrayList<String>(lhs);
		for (String ss : list) {
			System.out.println(ss);
		}
		System.out.println("-----------");

		// HashTable
		Hashtable<String, Object> ht = new Hashtable<String, Object>();
		String[] test1 = { "aa", "bb", "cc" };
		ht.put("test1", test1);
		ht.put("test2", "");
		ht.put("test3", "a");

		String[] getTest1 = (String[]) ht.get("test1");
		for (String test : getTest1) {
			System.out.println("1. " + test);
		}

		String test2 = (String) ht.get("test2");
		System.out.println(test2);
		String test3 = (String) ht.get("test3");
		if (test2.length() != 0 && test3.length() != 0) {
			System.out.println("come first!");
		} else if (test2.length() != 0) {
			System.out.println("come second!");
		} else if (test3.length() != 0) {
			System.out.println("come third!");
		} else {
			System.out.println("nothing happened");
		}

		System.out.println("-----------");

		// List: change element
		String[] testX = { "#aa", "#bb", "#cc" };
		List<String> ls = Arrays.asList(testX);
		for (String test : ls) {
			System.out.print(test + " ");
		}
		System.out.println();
		for (String test : ls) {
			test = "#" + test;
		}
		System.out.println();
		for (String test : ls) {
			System.out.print(test + " ");
		}
		System.out.println();
		for (int i = 0; i < ls.size(); i++) {
			ls.set(i, "#" + ls.get(i));
		}
		System.out.println();
		for (String test : ls) {
			System.out.print(test + " ");
		}
		System.out.println();
		System.out.println("--------------------");
	}

}
