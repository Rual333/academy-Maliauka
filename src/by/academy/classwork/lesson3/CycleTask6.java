package by.academy.classwork.lesson3;

import java.util.Scanner;

public class CycleTask6 {
	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum of money: ");
		double sum = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter years:");
		int years = sc.nextInt();
		for (int i = 1; i <= years; i++) {
			sum += sum * 0.03;
		}
		System.out.println("Result sum of money is: " + sum);
		sc.close();
	}
}
