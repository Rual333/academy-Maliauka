package by.academy.lessons.lesson3;

import java.util.Scanner;

public class CycleTask2 {
	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.print(sum);
		sc.close();
	}
}
