package by.academy.lessons.lesson3;

import java.util.Random;

public class MassTask6 {
	public static void main(String... strings) {
		int[] arr = new int[4];
		Random rand = new Random();
		boolean vozr = true;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 + rand.nextInt(100 - 10);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] >= arr[i + 1]) {
				vozr = false;
			}
		}
		if (vozr) {
			System.out.println("The Array is a strictly increasing sequence");
		} else {
			System.out.println("The Array isn't a strictly increasing sequence");
		}
	}
}
