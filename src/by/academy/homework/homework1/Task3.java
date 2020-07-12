/*
 * JC1, Homework 1, Task3:
 * 
 * Program  prints out multiplication table for entered number. 
 * Number should be from 1 to 10.
 * 
 * Author: Ivan Maliauka
 * 
 */

package by.academy.homework.homework1;

import java.util.Scanner;

public class Task3 {
	public static void main(String... strings) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from 1 to 10: ");
		num = sc.nextInt();
		if (num > 0 && num <= 10) {
			printTable(num);
		} else {
			System.out.println("You entered wrong number!");
		}
		sc.close();
	}

	private static void printTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
	}
}
