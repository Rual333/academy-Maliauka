/* С помощью SimpleDateFormat пропарсить данные, введеные с консоли, в зависимости от паттерна, к которому дата подходит.
	Вывести строку в следующем формате:
	День: <Day>
	Месяц: <Month>
	Year: <Year> 
	
//4. Конвертировать дату из прошлого задания в календарь. Добавить 3 месяца, 2 дня, 4 часа.
	*
	*/

package by.academy.classwork.lesson6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RegexTask3_4 {
	public static SimpleDateFormat format1 = new SimpleDateFormat("d/M/yyyy");
	public static SimpleDateFormat format2 = new SimpleDateFormat("d-M-yyyy");
	public static SimpleDateFormat format3 = new SimpleDateFormat("d/M/yyyy HH:mm");

	public static void main(String... args) throws ParseException {
		String[] tests1 = { "50/50/9999", "00/00/0000", "13/12/2020", "9/9/2020", "11" };
		String[] tests2 = { "50-50-9999", "00-00-0000", "13-12-2020", "12-12-2020", "11" };

		for (String t : tests1) {
			boolean isValid = RegexTask2.isValidDateString(t);
			if (isValid) {
				Date date = format1.parse(t);
				Calendar c = Calendar.getInstance();
				c.setTime(date);

				System.out.println("Date: ");
				printDate(c);

				addDate(c, 3, 2, 4);

				System.out.println("Date after some changes: ");
				printDate(c);
			}
		}

		for (String t : tests2) {
			boolean isValid = RegexTask2.isValidDateString(t);
			if (isValid) {
				Date date = format2.parse(t);

				Calendar c = Calendar.getInstance();
				c.setTime(date);

				System.out.println("Date: ");
				printDate(c);

				addDate(c, 3, 2, 4);

				System.out.println("Date after some changes: ");
				printDate(c);
			}
		}
	}

	private static void printDate(Calendar c) {
		System.out.println("Day: <" + c.get(Calendar.DAY_OF_MONTH) + ">");
		System.out.println("Month: <" + (c.get(Calendar.MONTH) + 1) + ">");
		System.out.println("Year: <" + c.get(Calendar.YEAR) + ">");
		System.out.println("Hour: <" + c.get(Calendar.HOUR_OF_DAY) + ">");
	}

	private static void addDate(Calendar calendar, int month, int day, int hour) {
		calendar.add(Calendar.MONTH, month);
		calendar.add(Calendar.DAY_OF_MONTH, day);
		calendar.add(Calendar.HOUR, hour);
	}

}
