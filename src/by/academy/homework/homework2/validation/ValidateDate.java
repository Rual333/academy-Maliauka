package by.academy.homework.homework2.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDate {
	// a
	public static Pattern p1 = Pattern.compile("^([0]?[1-9]|[12][0-9]|[3][01])/([0][1-9]|[1-9]|1[0-2])/\\d{4}");
	// b
	public static Pattern p2 = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");

	public static boolean validate1(String string) {
		Matcher m1 = p1.matcher(string);
		if (m1.find()) {
			return true;
		}
		return false;
	}

	public static boolean validate2(String string) {
		Matcher m2 = p2.matcher(string);
		if (m2.find()) {
			return true;
		}
		return false;
	}

}
