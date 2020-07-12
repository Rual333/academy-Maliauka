package by.academy.lessons.lesson3;

import java.util.Random;

public class MassTask3 {
	public static void main(String... strings) {
		int[] arr = new int[15];
		Random rand = new Random();
		int kol = 0;
		for (int a : arr) {
			a = rand.nextInt(10);
			System.out.print(a + " ");
			if (a % 2 == 0) {
				kol++;
			}
		}
		System.out.println();
		System.out.println(kol);
	}
}
