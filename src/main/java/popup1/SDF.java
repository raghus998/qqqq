package popup1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class SDF {

	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat s1 = new SimpleDateFormat("d");
		String day = s1.format(date);
		System.out.println(day);
		
		SimpleDateFormat s2 = new SimpleDateFormat("MMMM");
		String month = s2.format(date);
		System.out.println(month);
		
		SimpleDateFormat s3 = new SimpleDateFormat("YYYY");
		String year = s3.format(date);
		System.out.println(year);
		
		System.out.println("----------------------------------------");
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate plusD = today.plusDays(10);
		System.out.println(plusD);
		
		LocalDate plusm = today.plusMonths(2);
		System.out.println(plusm);
		
		LocalDate minusd = today.minusDays(2);
		System.out.println(minusd);
	}

}
