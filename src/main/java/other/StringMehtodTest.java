package other;

import java.text.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Objects;

public class StringMehtodTest {

	public static void main(String[] args){
		// String method: regionMatches
		String aa = "tags";
		String bb = "tags%5B%5D";
		if(aa.regionMatches(false, 0, bb, 0, 4)){
			System.out.println(" \"tags\" and \"tags%5B%5D\" are partial match");
		}
		else{
			System.out.println(" \"tags\" and \"tags%5B%5D\" are not partial match");
		}
		
		//String method: endsWith
		String cc = "fileExt%5B%5D";
		if(cc.endsWith("%5B%5D")){
			System.out.println("the index of \"%5B%5D\" is "+cc.indexOf("%5B%5D"));
			System.out.println("trim the string \"%5B%5D\"");
			System.out.println(cc.substring(0, cc.indexOf("%5B%5D")));
			System.out.println(cc);
		}
		else{
			System.out.println("nothing happened");
		}
		
		//convert string to date:SimpleDateFormat
		String dateFormat = "yyyy/MM/dd";
		SimpleDateFormat df = new SimpleDateFormat(dateFormat);
		try {
			Date d1 = df.parse("2017/01/20");
			Date d2 = df.parse("2017/1/21");
			System.out.println(d1);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Hashtable<String,Object>
		Hashtable<String,Object> ht = new Hashtable<String, Object>();
		String[] test1 = {"aa", "bb", "cc"};
		ht.put("test1", test1);
		ht.put("test2", "");
		ht.put("test3", "a");
		
		String[] getTest1 = (String[]) ht.get("test1");
		for(String test : getTest1){
			System.out.println("1. "+test);
		}
		
		//test1
		String test2 = (String)ht.get("test2");
		String test3 = (String)ht.get("test3");
		System.out.println(test2);
		if(test2.length() != 0 && test3.length() != 0){
			System.out.println("come first!");
		}else if (test2.length() != 0){
			System.out.println("come second!");
		}else if (test3.length() != 0){
			System.out.println("come third!");
		}else{
			System.out.println("nothing happened");
		}
		
		
		//test2
		String[] testX ={"#aa","#bb","#cc"};
		List<String> ls = Arrays.asList(testX);
		for(String test: ls){
			test = "#"+test;
		}
		for(String test : ls){
			System.out.print(test+" ");
		}
		
		for(int i = 0; i < ls.size(); i++){
			ls.set(i, "."+ls.get(i)+"$");
//			ls.set(i, ls.get(i).substring(1));
		}
		for(String test : ls){
			System.out.print(test+" ");
		}
		
		//test3
		String a = "";
		if(a.isEmpty()){
			System.out.println("it is empty string");
		}
		String b = null;
		if(Objects.nonNull(b) && b.isEmpty()){
			System.out.println("it is empty string");
		}
		
		//test4
		String format = "[\\x20-\\x7e]*";
		String testA = "ai!~`390\\?><";
		if(testA.matches(format)){
			System.out.println("hihi");
		}
	}

}
