package by.academy.classwork.lesson3;

import java.util.Scanner;

public class CycleTask7 {
	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 pairs of numbers divided by spase: ");
		String[] num = sc.nextLine().split(" ");

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num.length - 1; i += 2) {
			if (Integer.parseInt(num[i]) > Integer.parseInt(num[i + 1])) {
				System.out.println(num[i]);
			} else {
				System.out.println(num[i + 1]);
			}
		}
		sc.close();
	}
}
