/*
 * Task3
 * 
 * Creates random number from 0 to Integer.MAX_VALUE and prints if its even or odd
 * 
 * Author: Ivan Maliauka
 * 
 */

package by.academy.lessons.lesson2;

public class Task3 {
	public static void main(String[] args) {
		int number = (int) (Math.random() * Integer.MAX_VALUE);
		if (number % 2 == 0) {
			System.out.println("Created number " + number + " is even");
		} else {
			System.out.println("Created number " + number + " is odd");
		}
	}
}
