/*
 * Task5
 * 
 * Maximum, minimum and average of 2 numbers entered from keyboard
 * 
 * Author: Ivan Maliauka
 * 
 */

package by.academy.lesson2;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = sc.nextInt();
		sc.close();
		if (num1 > num2) {
			System.out.println("Maximum number is: " + num1 + "; Minimum number is: " + num2);
		} else if (num2 > num1) {
			System.out.println("Maximum number is: " + num2 + "; Minimum number is: " + num1);
		} else {
			System.out.println("Numbers are equal");
		}
		result = (double) (num1 + num2) / 2;
		System.out.println("Average is: " + result);
	}
}
