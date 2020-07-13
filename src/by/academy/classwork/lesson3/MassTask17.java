package by.academy.classwork.lesson3;

import java.util.Random;

public class MassTask17 {
	public static void main(String[] args) {
		int[][] arr = new int[6][7];
		int[] indArr = new int[6];
		Random rand = new Random();
		int max = 0, temp;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				arr[i][j] = rand.nextInt(10);
				System.out.print(arr[i][j] + " ");
				if (arr[i][j] > max) {
					indArr[i] = j;
					max = arr[i][j];
				}
			}
			System.out.println();
			max = 0;
		}

		for (int i = 0; i < 6; i++) {
			temp = arr[i][0];
			arr[i][0] = arr[i][indArr[i]];
			arr[i][indArr[i]] = temp;
		}

		System.out.println();

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
