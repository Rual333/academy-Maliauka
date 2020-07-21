package by.academy.classwork.lesson6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RegexTask3 {
	public static SimpleDateFormat format1 = new SimpleDateFormat("d/M/yyyy");
	public static SimpleDateFormat format2 = new SimpleDateFormat("d/M/yyyy");

	public static void main(String... strings) throws ParseException {

		String[] tests1 = { "13/12/2020", "9/9/2020" };
		String[] tests2 = { "13-12-2020", "9-9-2020" };
		for (String t : tests1) {
			boolean isValid = RegexTask2.isValidDateString(t);
			if (isValid) {
				Date date = format1.parse(t);
				System.out.println(date);
				Calendar c = Calendar.getInstance();
				c.setTime(date);
				System.out.println(format1.format(c.getTime()));
				c.add(Calendar.MONTH, 3);
				
				c.add(Calendar.DAY_OF_MONTH, 2);
				c.add(Calendar.HOUR, 4);
				System.out.println(format1.format(c.getTime()));

			}
		}
		for (String t : tests2) {
			boolean isValid = RegexTask2.isValidDateString(t);
			if (isValid) {
				Date date = format2.parse(t);
				System.out.println(date);
				Calendar c = Calendar.getInstance();
				c.setTime(date);
				System.out.println(format2.format(c.getTime()));
				c.add(Calendar.MONTH, 3);
				c.add(Calendar.DAY_OF_MONTH, 2);
				c.add(Calendar.HOUR, 4);
				System.out.println(format1.format(c.getTime()));

			}
		}
	}
}
