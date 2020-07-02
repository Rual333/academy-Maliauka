/*
 * JC1, Homework 1, Task1:
 * 
 * Program compute discount according to entered buyer age and purchase amount 
 * and prints out final price.
 * 
 * Author: Ivan Maliauka
 * 
 */

package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
	public static void main(String... strings) {
		int age;
		double discount = 0;
		double sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter purchase amount: ");
		sum = sc.nextDouble();
		System.out.println("Enter buyer age: ");
		age = sc.nextInt();
		if (age < 0 || sum < 0) {
			System.out.println("Purchase amount and age cannot be less than 0");
			sum = 0;
		} else if (sum < 100) {
			discount = 0.05;
		} else if (sum < 200) {
			discount = 0.07;
		} else if (sum < 300 && age > 18) {
			discount = 0.16;
		} else if (sum < 300) {
			discount = 0.09;
		} else if (sum < 400) {
			discount = 0.15;
		} else {
			discount = 0.2;
		}
		System.out.println("Final prise is: " + (sum - sum * discount));
		sc.close();
	}
}
