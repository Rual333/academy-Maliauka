/*
 * JC1, Homework 1, Task5:
 * 
 * Program  prints out amount of pairs from entered array, the difference of which is equal to the certain entered number.
 * 
 * Author: Ivan Maliauka
 * 
 */

package by.academy.homework.homework1;

import java.io.IOException;
import java.util.Scanner;

public class Task5 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
			System.out.println(arr[i]);
		}

		int result = pairs(k, arr);
		System.out.println(result);

		scanner.close();
	}

	static int pairs(int k, int[] arr) {
		int pairsCount = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (Math.abs(arr[j] - arr[i]) == k) {
					pairsCount++;
				}
			}
		}

		return pairsCount;
	}
}
