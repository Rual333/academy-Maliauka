/*
 * JC1, Homework 1, Task4:
 * 
 * Program  prints out degrees of two up to a million
 * 
 * Author: Ivan Maliauka
 * 
 */

package by.academy.homework1;

public class Task4 {
	public static void main(String... strings) {
		int two = 1;
		while ((two *= 2) < 1_000_000) {
			System.out.print(two + " ");
		}
	}
}
