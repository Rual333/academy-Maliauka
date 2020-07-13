package by.academy.classwork.lesson3;

import java.util.Random;

public class MassTask16 {
	public static void main(String[] args) {
	
		int[][] arr = new int[7][4];
		Random rand = new Random();
		int maxInd = 0, max = 0, composition = 1;

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = rand.nextInt(10) - 5;
				System.out.print(arr[i][j] + " ");
				composition *= Math.abs(arr[i][j]);
			}
			System.out.println();
			if (composition > max) {
				max = composition;
				maxInd = i;
			}
			composition = 1;
		}

		System.out.println(maxInd);
	}
}
