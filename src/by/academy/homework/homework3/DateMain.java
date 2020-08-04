package by.academy.homework.homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMain {

	static final Pattern p = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");

	public static void main(String... strings) {

		Scanner sc = new Scanner(System.in);

		MyCustomDate date = new MyCustomDate(getDateStr(sc));
		System.out.println(date.toString());
		System.out.println(date.isLeapYear());
		date.printDayOfWeek();
		MyCustomDate date2 = new MyCustomDate();
		date2.setDate(getDateStr(sc));
		date2.printDayOfWeek();
		System.out.println(MyCustomDate.calculateInterval(date, date2));
		sc.close();
	}

	public static boolean validateDate(String date) {
		Matcher m = p.matcher(date);
		return m.find();
	}

	public static String enterDate(Scanner sc) {
		System.out.println("Enter date: ");
		String date = sc.nextLine();
		return date;
	}

	public static String getDateStr(Scanner sc) {
		System.out.println("Enter the date in format \"dd-mm-yyyy\"");
		String dateStr;
		while (true) {
			dateStr = enterDate(sc);
			if (!validateDate(dateStr)) {
				System.out.println("Wrong date format, try again:");
			} else {
				return dateStr;
			}
		}
	}
}
