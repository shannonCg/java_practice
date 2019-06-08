package test_simple;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DateMethodTest {
	public static void main(String[] args) throws ParseException {
		//時間格式從西元轉為民國
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String timeStr = "1993/03/03";
		System.out.println(timeStr);
		Date now = sdf.parse(timeStr);
		String nowFormat = sdf.format(now);
		List<String> list = Arrays.asList(nowFormat.split("/"));
		String changeYear = list.stream()
								.findFirst()
								.map(year -> Integer.parseInt(year)-1911)
								.map(year -> year < 100 ? "0"+String.valueOf(year) : String.valueOf(year))
								.get();
		System.out.println(changeYear+list.get(1)+list.get(2));
		System.out.println("-----------------");
		
		
		//parse time format
		Date d1 = new Date();
		System.out.println("d1= "+d1.toString());
//		DateFormat df1 = DateFormat.getInstance();
//		DateFormat df1 = DateFormat.getDateInstance();
//		DateFormat df1 = DateFormat.getTimeInstance();
		DateFormat df1 = DateFormat.getDateTimeInstance();
		String format = df1.format(d1);
		System.out.println(format);
		Date d2 = df1.parse(format);
		System.out.println("d2= "+d2.toString());
	}
}
