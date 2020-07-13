package by.academy.classwork.lesson3;

import java.util.Random;

public class MassTask9 {
	public static void main(String... strings) {
		int count = 0;
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		double[] darr = new double[10];
		Random rand = new Random();
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rand.nextInt(9) + 1;
			arr2[i] = rand.nextInt(9) + 1;
			darr[i] = (double) arr1[i] / arr2[i];
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int a : arr2) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (double a : darr) {
			System.out.print(a + " ");
			if (a % 1 == 0) {
				count++;
			}
		}
		System.out.println("\n" + count);
	}
}
