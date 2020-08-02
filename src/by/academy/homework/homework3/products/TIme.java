package by.academy.homework.homework3.products;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TIme {
	public static void main(String... strings) {
		Date deadline = new Date();
		Calendar c = Calendar.getInstance();

		c.add(Calendar.DAY_OF_MONTH, 2);
		deadline = c.getTime();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(dateformat.format(deadline));
	}
}
