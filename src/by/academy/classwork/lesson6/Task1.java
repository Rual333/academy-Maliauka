package by.academy.classwork.lesson6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		
		Pattern p = Pattern.compile("[,.:;!?]");
		Matcher m = p.matcher(str);
		sc.close();
		
		int i = 0;
		while (m.find()) {
			i++;
		}
		System.out.println(i);
	}
}
