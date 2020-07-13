package by.academy.classwork.lesson3;

import java.util.Scanner;

public class CycleTask4 {
	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of numbers: ");
		int n = sc.nextInt();
		int nn, kolP = 0, kolO = 0, kolZ = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Entered " + i + " number: ");
			nn = sc.nextInt();
			if (nn == 0) {
				kolZ++;
			} else if (nn > 0) {
				kolP++;
			} else {
				kolO++;
			}
		}
		System.out.println("Amount of positive numbers is: " + kolP);
		System.out.println("Amount of negative numbers is: " + kolO);
		System.out.println("Amount of zerous is: " + kolZ);
		sc.close();
	}
}
