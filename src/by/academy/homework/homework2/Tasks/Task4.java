package by.academy.homework.homework2.Tasks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	public static Pattern p1 = Pattern.compile("^([0]?[1-9]|[12][0-9]|[3][01])/([0][1-9]|[1-9]|1[0-2])/\\d{4}");
	public static Pattern p2 = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");
	public static SimpleDateFormat format1 = new SimpleDateFormat("d/M/yyyy");
	public static SimpleDateFormat format2 = new SimpleDateFormat("d-M-yyyy");

	public static void main(String... args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();

		System.out.println("Enter data: ");
		String[] data = sc.nextLine().split(" ");
		System.out.println(
				"Which pattern do you want to chose (Please enter the number): 1.dd/MM/yyyy or 2.dd-MM-yyyy ?");
		switch (sc.next()) {
		case "1":
			parseAndPrintDate(data, format1, calendar, p1);
			break;
		case "2":
			parseAndPrintDate(data, format2, calendar, p2);
			break;
		default:
			System.out.println("You entered wrond number");
		}

		sc.close();
	}

	private static void parseAndPrintDate(String[] strArr, SimpleDateFormat format, Calendar calendar, Pattern p)
			throws ParseException {
		for (String t : strArr) {
			boolean isValid = isValidDateString(t, p);
			if (isValid) {
				Date date = format.parse(t);
				calendar.setTime(date);

				System.out.println("Date: ");
				printDate(calendar);
			}
		}

	}

	private static void printDate(Calendar c) {
		System.out.println("Day: <" + c.get(Calendar.DAY_OF_MONTH) + ">");
		System.out.println("Month: <" + (c.get(Calendar.MONTH) + 1) + ">");
		System.out.println("Year: <" + c.get(Calendar.YEAR) + ">");
	}

	public static boolean isValidDateString(String stringDate, Pattern p) {
		Matcher m1 = p.matcher(stringDate);
		if (m1.find()) {
			return true;
		}

		return false;
	}

}
