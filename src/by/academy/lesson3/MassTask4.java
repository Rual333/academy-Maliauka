package by.academy.lesson3;

import java.util.Random;

public class MassTask4 {
	public static void main(String... strings) {
		int[] arr = new int[8];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
			System.out.print(arr[i] + " ");
		}
		for (int i = 1; i < arr.length; i++) {
			arr[i] = 0;
			i++;
		}
		System.out.println();
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
