package other;

import java.text.ParseException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ISOFormat {
	public static void main(String[] args) throws ParseException {
		Date now = new Date();
		Instant instant = Instant.ofEpochMilli(now.getTime());
		System.out.println(instant);
		OffsetDateTime odt = instant.atOffset(ZoneOffset.UTC);
		System.out.println(instant.toEpochMilli());
		System.out.println(now.getTime());
		System.out.println(odt.format(DateTimeFormatter.ISO_DATE_TIME));
	}
}
