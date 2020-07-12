/*
 * JC1, Homework 1, Task2:
 * 
 * Program  prints out different information according to entered type of data:
 * 
 * if its int - Reminder of division by 2;
 * if its double - 70 % of entered number;
 * if its float - Squared of entered number;
 * if its char - Code of entered symbol;
 * if its string - prints "Hello " + entered string;
 * if its another type - prints "Unsupported type".
 * 
 * Author: Ivan Maliauka
 * 
 */

package by.academy.homework.homework1;

import java.util.Scanner;

public class Task2 {
	public static void main(String... strings) {
		String type;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data type: ");
		type = sc.nextLine();
		System.out.println("Enter the data: ");
		switch (type.toLowerCase()) {
		case "int":
			int var1 = sc.nextInt();
			System.out.println("Reminder of division by 2 is : " + var1 % 2);
			break;
		case "double":
			double var2 = sc.nextDouble();
			System.out.println("70 % of number is: " + var2 * 0.7);
			break;
		case "float":
			float var3 = sc.nextFloat();
			System.out.println("Squared number: " + (var3 * var3));
			break;
		case "char":
			String chstr = sc.next();
			char var4 = chstr.charAt(0);
			System.out.println("Code of symbol is: " + (int) var4);
			break;
		case "string":
			String newString = sc.nextLine();
			System.out.println("Hello " + newString);
			break;
		default:
			System.out.println("Unsupported type");
		}
		sc.close();
	}
}
