package java8.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LocalDateUtil {

	protected static ZoneId getZoneId(Integer zone){
		String zoneId = zone < 0 ? zone.toString() : "+"+zone;
		return ZoneId.of(zoneId);
	}
	
	public static LocalDate parseByInstant(Instant instant, Integer zone){
		
		return _parseByInstant(instant, zone);
	}
	
	public static LocalDate parseByDate(Date date, Integer zone){
		Instant instant = InstantUtil.parseByDate(date);
		
		return _parseByInstant(instant, zone);
	}
	
	protected static LocalDate _parseByInstant(Instant instant, Integer zone){
		return instant.atZone(getZoneId(zone))
				.toLocalDate();
	}
	
	public static Date getDateByLocalDate(LocalDate localDate, Integer zone){
		Instant instant = localDate.atStartOfDay().toInstant(ZoneOffset.ofHours(zone));
		System.out.println(instant);
		return Date.from(instant);
	}
	
	public static List<LocalDate> getMonthDaysByInstant(Instant day, Integer zone){
		LocalDate localDate = _parseByInstant(day, zone);
		LocalDate firstDayOfMonth = localDate.with(TemporalAdjusters.firstDayOfMonth());
		LocalDate lastDayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth());
		
		LocalDate dayOfMonth = firstDayOfMonth;
		List<LocalDate> days = new ArrayList<>();
		while(lastDayOfMonth.isAfter(dayOfMonth) || lastDayOfMonth.isEqual(dayOfMonth)){
			days.add(dayOfMonth);
			dayOfMonth = dayOfMonth.plusDays(1);
		}
		
		for(LocalDate everyday : days){
			System.out.println(everyday);
		}
		System.out.println("---------------------------------");
		
		return days;
	}
	
	public static void main(String[] args){
		String isoString = "2017-07-31T16:00:00.000Z";
		Integer zone = 8;
		
		Instant instant = InstantUtil.parseByISOString(isoString);
		System.out.println("1.request time:"+instant);
		List<LocalDate> days = LocalDateUtil.getMonthDaysByInstant(instant, zone);
		
		System.out.println("2.request time:"+instant);
		LocalDate localDate = LocalDateUtil.parseByInstant(instant, zone);
		System.out.println("localDate:"+localDate);
		Date date = LocalDateUtil.getDateByLocalDate(localDate, zone);
		System.out.println("date:"+date);
		System.out.println("-------------------");
		
		Date now = new Date();
		Instant nowInstant = InstantUtil.parseByDate(now);
		System.out.println("1.request time:"+nowInstant);
		days = LocalDateUtil.getMonthDaysByInstant(nowInstant, zone);
		
		System.out.println("2.request time:"+nowInstant);
		localDate = LocalDateUtil.parseByInstant(nowInstant, zone);
		System.out.println("localDate:"+localDate);
		date = LocalDateUtil.getDateByLocalDate(localDate, zone);
		System.out.println("date:"+date);
		System.out.println("-------------------");
		
	}
	
}
