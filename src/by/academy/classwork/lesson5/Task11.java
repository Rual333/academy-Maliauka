package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task11 {
	public static void main(String... strings) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int k = sc.nextInt();
		int temp = 0;
		String str;

		if (k > -10000 && k <= 5) {
			temp++;
		}
		if (k >=0 && k <= 10) {
			temp += 2;
		}
		if (k >=5 && k <=15) {
			temp += 4;
		}
		if (k >=10 && k <= 10000) {
			temp += 5;
		}
		switch (temp) {
		case 1:
			str = "(-1000-5]";
			break;
		case 3:
			str = "(-1000-5], [0-10]";
			break;
		case 5:
			str = "[10-10000]";
			break;
		case 6:
			str = "[0-10], [5-15]";
			break;
		case 7:
			str = "(-1000-5], [0-10], [5-15]";
			break;
		case 9:
			str = "[5-15], [10-10000]";
			break;
		case 11:
			str = "[0-10], [5-15], [10-10000]";
			break;
		default:
			str = "out of range";
		}
		System.out.println("Number are in the range: " + str);
		sc.close();
	}
}
