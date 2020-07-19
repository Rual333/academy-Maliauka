package by.academy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask2 {
	public static void main(String... strings) {
		String str = "11/12/1994, 11/23/5432, 11-85-1995";
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		Pattern p1 = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
		Pattern p2 = Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{4}");
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
}
