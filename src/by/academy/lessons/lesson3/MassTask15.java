package by.academy.lessons.lesson3;

import java.util.Random;

public class MassTask15 {
	public static void main(String[] args) {
	
		int[][] arr = new int[5][8];
		Random rand = new Random();
		int max = -99;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				arr[i][j] = rand.nextInt(201) - 99;
				System.out.print(arr[i][j] + " ");
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			System.out.println();
		}

		System.out.println(max);
	}
}
