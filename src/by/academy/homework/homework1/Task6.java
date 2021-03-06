/*
 * JC1, Homework 1, Task6:
 * 
 * Program  determines whether one String is a permutation of another String
 * Spaces are counted.
 * 
 * Author: Ivan Maliauka
 * 
 */

package by.academy.homework.homework1;

import java.util.Scanner;

public class Task6 {
	public static void main(String... strings) {
		String s1;
		String s2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		s1 = sc.nextLine();
		System.out.print("Enter the second string: ");
		s2 = sc.nextLine();
		boolean permuted = arePermuted(s1, s2);
		if (permuted) {
			System.out.println("One String is a permutation of another string");
		} else {
			System.out.println("One String isn't a permutation of another string");
		}
		sc.close();
	}

	private static boolean arePermuted(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			return false;
		}

		int[] temp = new int[256];

		for (int i = 0; i < s1.length(); i++) {
			temp[s1.charAt(i)]++;
			temp[s2.charAt(i)]--;

		}

		for (int i : temp) {
			if (i < 0) {
				return false;
			}
		}
		
		return true;
	}
}
