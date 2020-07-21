package by.academy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask2 {
	public static Pattern p1 = Pattern.compile("^([0]?[1-9]|[1|2][0-9]|[3][0|1])/([0][1-9]|1[0-2])/\\d{4}");
	public static Pattern p2 = Pattern.compile("^([0]?[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|1[0-2])-\\d{4}");

	public static void main(String... strings) {
		String str = "02/12/1994, 11/23/5432, 11-85-1995, 11-05-1929";
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		Matcher m1 = p1.matcher(str);
		Matcher m2 = p2.matcher(str);

		while (m1.find()) {
			sb1.append(m1.group(0) + " ");
		}
		while (m2.find()) {
			sb2.append(m2.group(0) + " ");
		}
		System.out.println(sb1);
		System.out.println(sb2);
	}

	public static boolean isValidDateString(String stringDate) {
		boolean result = false;
		Matcher m1 = p1.matcher(stringDate);
		if (m1.find()) {
			return true;
		}

		Matcher m2 = p2.matcher(stringDate);
		if (m2.find()) {
			return true;
		}

		return result;
	}
}
