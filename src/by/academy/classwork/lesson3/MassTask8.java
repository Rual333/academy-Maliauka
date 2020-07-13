package by.academy.classwork.lesson3;

import java.util.Random;

public class MassTask8 {
	public static void main(String... strings) {
		int[] arr = new int[12];
		Random rand = new Random();
		int max = -15;
		int indOfMax = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(31) - 15;
			System.out.print(arr[i] + " ");
			if (arr[i] >= max) {
				max = arr[i];
				indOfMax = i;
			}
		}
		System.out.println("\nMax element: " + max + ", index of max: " + indOfMax);
	}
}
