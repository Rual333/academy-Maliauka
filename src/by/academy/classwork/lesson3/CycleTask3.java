package by.academy.classwork.lesson3;

import java.util.Scanner;

public class CycleTask3 {
	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		System.out.print(sum);
		sc.close();
	}
}
