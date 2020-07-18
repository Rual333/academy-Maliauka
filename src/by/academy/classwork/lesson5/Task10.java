package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task10 {
	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		double k = sc.nextDouble();
		String str;
		switch ((int) Math.ceil(k / 5)) {
		case 1:
			str = "(0, 5]";
			break;
		case 2:
			str = "(5, 10]";
			break;
		default:
			switch ((int) Math.ceil(k / 10000)) {
			case 0:
				str = "(-10000, 0]";
				break;
			case 1:
				str = "(10, 10000]";
				break;
			default:
				str = "out of range";
			}
		}
		System.out.println("Number are in the range: " + str);
		sc.close();
	}
}
