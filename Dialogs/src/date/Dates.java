package date;

import java.time.format.DateTimeFormatter;

public class Dates {
	public static DateTimeFormatter formatterDate() {
		return DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");
	}
}
