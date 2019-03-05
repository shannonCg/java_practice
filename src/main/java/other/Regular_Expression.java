package other;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Regular_Expression {

	public static void main(String[] args) {
//		String regex = ".*\\.jpg$|.*\\.txt$|"; //琩高Ю琌.jpg┪.txt
//		String regex = "^[^\\s]+[A-Za-z\\s]{1,21}[^\\s]+$"; //ぃす砛玡,琌い丁フ
//		String regex = "[^/:*?<>|\\x5c]+"; //ぃす砛疭才腹﹃い(/:*?<>|\), ㄤい\asciiせ秈\x5c
//		String regex = "[^~!@$%^&*()_+{}|\\[\\]?'\"/><.,:;]+"; //ぃす砛疭才腹﹃い(~!@$%^&*()_+{}|[]ˇ〃?/>.<,:;)
//		String regex = ".*\\Q[abc]\\E.*"; //场﹃才,ゑ癸﹃い疭じ(/Q㎝/Eぇ丁常炊硄じ)
		String regex = ".*[abc].*"; //场﹃才,疭じごΤノ
		
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
		
		//す砛いゅじ
		String chinese = "盢盢";
		String pattern1 = "[\\u4e00-\\u9fff]*";
		String pattern2 = "[\\x{4e00}-\\x{9fa5}]*";
		if(chinese.matches(pattern1)){
			System.out.println("hihihi");
		}
		
		//す砛email
		String email = "ss@google.tws";
		String pattern3 = "([\\w-\\.]+)@((?:[\\w]+\\.)+)([a-zA-Z]{2,4})";
		if(email.matches(pattern3)){
			System.out.println("hihihihi");
		}
	}

}