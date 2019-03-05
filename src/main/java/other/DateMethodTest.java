package other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DateMethodTest {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date now = sdf.parse("1993/03/03");
		System.out.println(now.getTime());
		String nowFormat = sdf.format(now);
		List<String> list = Arrays.asList(nowFormat.split("/"));
		String changeYear = list.stream()
								.findFirst()
								.map(year -> Integer.parseInt(year)-1911)
								.map(year -> year < 100 ? "0"+String.valueOf(year) : String.valueOf(year))
								.get();
		System.out.println(changeYear+list.get(1)+list.get(2));
	}
}
