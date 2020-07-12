package by.academy.lessons.lesson3;

import java.util.Random;

public class MassTask10 {
	public static void main(String... strings) {

		int[] arr = new int[11];
		int[] countArr = new int[arr.length];
		boolean equals = false;
		int max = 0;
		int maxElement = 0;
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(3) - 1;
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					countArr[i]++;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (countArr[i] > max) {
				max = countArr[i];
				equals = true;
				maxElement = arr[i];
			} else if (countArr[i] == max) {
				equals = false;
			}
		}

		if (equals) {
			System.out.println(
					"\nElement with maximum numbers of repetitions: " + maxElement + ", number of repetitions: " + max);
		}

	}
}
