package fecha;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTest {

	public static void main(String[] args) {
		LocalDate fecha,fechaManual,fechaAlarm;
		LocalTime hora;
		LocalDateTime feho;
		DateTimeFormatter format= DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT);
		DateTimeFormatter formatPerso= DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");

		fecha=LocalDate.now();
		fechaManual=LocalDate.parse("10/10/2023",formatPerso);
		hora=LocalTime.now();
		feho=LocalDateTime.of(fecha, hora);
		
		System.out.println("fechaManual= "+fechaManual.format(formatPerso));

		fechaAlarm=fecha.minusDays(25);
		System.out.println(fechaAlarm);
		int day=(int) fechaAlarm.until(fecha,ChronoUnit.DAYS);
		System.out.println(day);
//		System.out.println("fecha= "+fecha);
//		System.out.println("hora= "+hora);
//		
//		System.out.println("fecha y hora: "+feho);
//		System.out.println("fecha y hora: "+feho.format(format));
	}

}
