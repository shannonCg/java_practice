package java8.time;

import java.time.Instant;
import java.util.Date;

public class InstantUtil {

	public static Instant parseByISOString(String isoString){
		return Instant.parse(isoString);
	}
	
	public static Instant parseByDate(Date date){
		return Instant.ofEpochMilli(date.getTime());
	}
	
	public static void main(String[] args){
		String isoString = "2018-07-12T16:00:00.000Z";
		
		Instant instant = InstantUtil.parseByISOString(isoString);
		System.out.println(instant);
		
		Date now = new Date();
		Instant nowInstant = InstantUtil.parseByDate(now);
		System.out.println(nowInstant);
	}
}
