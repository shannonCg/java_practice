package other;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Regular_Expression {

	public static void main(String[] args) {
//		String regex = ".*\\.jpg$|.*\\.txt$|"; //查詢字尾是.jpg或.txt
//		String regex = "^[^\\s]+[A-Za-z\\s]{1,21}[^\\s]+$"; //不允許前後空格,但是可以在字的中間加空白
//		String regex = "[^/:*?<>|\\x5c]+"; //不允許特殊符號在字串中(/:*?<>|\), 其中\的ascii十六進位為\x5c
//		String regex = "[^~!@$%^&*()_+{}|\\[\\]?'\"/><.,:;]+"; //不允許特殊符號在字串中(~!@$%^&*()_+{}|[]’”?/>.<,:;)
//		String regex = ".*\\Q[abc]\\E.*"; //部份字串符合,且比對的字串中取消特殊字元的功能(/Q和/E之間的字都為普通字元)
		String regex = ".*[abc].*"; //部份字串符合,特殊字元的功能仍有作用
		
//		String compareStr = "sfewo.TXT";
//		String compareStr = "aaa.JPG";
//		String compareStr = "ABC aa";
//		String compareStr = "[abc]2";
		String compareStr = "a2";
		
		System.out.println(compareStr);
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(compareStr);
		if(m.matches()){
			System.out.println("it matches");
		}else{
			System.out.println("it does not match");
		}
		System.out.println(p);
		String s = Pattern.quote("/12345/6789");
		System.out.println(s);
		System.out.println(Pattern.quote(".test$"));
		
		
		//equalsIgnoreCase
		String test1 = "aBk";
		if("ABK".equalsIgnoreCase(test1)){
			System.out.println("ignore case");
		}else{
			System.out.println("non ignore case");
		}
		
		//toLowerCase
		String test2 = "sbd%5B%5D";
		System.out.println(test2.toLowerCase());
		
		List<String> ls = Arrays.asList("aaa","bbb","ccc","aaa");
		for(String ss : ls){
			System.out.println(ss);
		}
		System.out.println("---");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(ls);
		for(String ss : lhs){
			System.out.println(ss);
		}
		System.out.println("---");
		
		ls = new ArrayList<String>(lhs);
		for(String ss : ls){
			System.out.println(ss);
		}
		System.out.println("---");
		
		
		String testStr = "AAAb";
		testStr = testStr.substring(0,testStr.length()-1);
		System.out.println(testStr);
		
		//只允許中文字元
		String chinese = "將將";
		String pattern1 = "[\\u4e00-\\u9fff]*";
		String pattern2 = "[\\x{4e00}-\\x{9fa5}]*";
		if(chinese.matches(pattern1)){
			System.out.println("hihihi");
		}
		
		//只允許email
		String email = "ss@google.tws";
		String pattern3 = "([\\w-\\.]+)@((?:[\\w]+\\.)+)([a-zA-Z]{2,4})";
		if(email.matches(pattern3)){
			System.out.println("hihihihi");
		}
	}

}