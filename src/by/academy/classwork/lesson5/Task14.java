package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task14 {

	public static void main(String... strings) {

		int monthNum = enterNumber();
		printMonth(monthNum);
	}

	public static int enterNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of month: ");
		int monthNum = sc.nextInt();
		sc.close();
		return monthNum;
	}

	public static void printMonth(int monthNum) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		if (monthNum < 1 || monthNum > 12) {
			System.out.println("Invalid number of month");
		} else {
			System.out.println(months[monthNum - 1]);

		}
	}
}
