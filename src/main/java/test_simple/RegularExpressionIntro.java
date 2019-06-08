package test_simple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionIntro {
	//regex的使用
	public static void findMatchRegexPosition(String compairedStr, String regex){
		System.out.println("str: "+compairedStr);
		System.out.println("regex: "+regex);
		Pattern ptn = Pattern.compile(regex);
		Matcher mth = ptn.matcher(compairedStr);
		while(mth.find()){
			System.out.print("I found the match string: "+mth.group());
			System.out.print(" starting at index: "+mth.start());
			System.out.print(" and ending at index: "+(mth.end()-1));
			System.out.println();
		}
		System.out.println("--------------------");
	}
	
	public static void main(String[] args) {
		/*
		 * 找出符合regex的字串
		 */
		findMatchRegexPosition("abaaaba", "ab");
		//只要有找到匹配的字串，就會被截取成群組(group)，再從剩下的字串繼續匹配，因此只會找到兩種匹配的位置
		findMatchRegexPosition("abababa", "aba"); 
		
		
		/*
		 * 使用中介字元(metacharacter)來搜尋:
		 * 	\d: 一個數字
		 *  \s: 一個空白字元
		 *  \w: 一個字的字元(字母,數字或"_")
		 *  []搭配字元搭配-: 找尋特定範圍的字元, ex:[abc],[a-c]
		 */
		findMatchRegexPosition("a 1 56 _z", "\\d");
		findMatchRegexPosition("a 1 56 _z", "\\s");
		findMatchRegexPosition("a 1 56 _z:", "\\w");
		findMatchRegexPosition("cafeBABE", "[bcaA-C]");
		
		/*
		 * 搭配量詞(quantifier)來搜尋:
		 *  +: 前面的表達式重複出現一次或多次
		 *  *: 前面的表達式重複出現0次或多次
		 *  ?: 前面的表達式重複出現0次或1次
		 */
		findMatchRegexPosition("12 0x 0x12 0Xf 0xg", "0[xX][0-9a-fA-f]");
		findMatchRegexPosition("12 0x 0x12 0Xf 0xg", "0[xX][0-9a-fA-f]+");
		//從,分隔的字串截出符合proj1開頭的字串
		findMatchRegexPosition("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java", "proj1[^,]*");
		//從,分隔的字串截出符合特定格式的電話號碼
		findMatchRegexPosition("12345678", "^\\d\\d\\d[-\\s]?\\d\\d\\d\\d$");
		findMatchRegexPosition("123 4567", "^\\d\\d\\d[-\\s]?\\d\\d\\d\\d$");
		findMatchRegexPosition("123-4567", "^\\d\\d\\d[-\\s]?\\d\\d\\d\\d$");
		findMatchRegexPosition("1234 567", "^\\d\\d\\d[-\\s]?\\d\\d\\d\\d$");
		findMatchRegexPosition("1234567", "^\\d\\d\\d[-\\s]?\\d\\d\\d\\d$");
		
		/*
		 * 搭配句號(.)來使用:
		 *  .: 代表任何字元
		 */
		findMatchRegexPosition("ab abc a c", "a.c");
		
		/*
		 * 貪婪(greedy)量詞vs勉強(reluctant)量詞
		 * 貪婪量詞: 會先讀進全部的來源資料，然後匹對是否符合樣式，如果不符合，則往回(往左)縮減一個字元再匹配一次，重複匹配到找到符合的字串為止
		 * 勉強量詞: 和貪婪量詞尋找方式相反，從最左邊第一個字元開始匹對，如果不符合，則往後(往右)增加一個字元再匹配一次
		 * 
		 * ?是貪婪的，??是勉強的，出現0次或1次
		 * *是貪婪的，*?是勉強的，出現0次或多次
		 * +是貪婪的，+?是勉強的，出現1次或多次
		 */
		findMatchRegexPosition("yyxxxyxx", ".*xx");
		findMatchRegexPosition("yyxxxyxx", ".*?xx");
	}

}