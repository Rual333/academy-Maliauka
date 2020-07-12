package by.academy.lessons.lesson3;

import java.util.Random;

public class MassTask5 {
	public static void main(String... strings) {
		int[] arr = new int[5];
		int[] arr2 = new int[5];
		Random rand = new Random();
		double aver1 = 0, aver2 = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(5);
			arr2[i] = rand.nextInt(5);
			System.out.print(arr[i] + " ");
			aver1 += (double) arr[i] / arr.length;
			aver2 += (double) arr2[i] / arr2.length;
		}
		System.out.println();
		for (int a : arr2) {
			System.out.print(a + " ");
		}
		if (aver1 > aver2) {
			System.out.println("The biggest average is in the first array");
		} else if (aver1 < aver2) {
			System.out.println("The biggest average is in the second array");
		} else {
			System.out.println("Average values are equal");
		}
	}
}
