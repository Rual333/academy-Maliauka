package by.academy.classwork.lesson3;

import java.util.Random;

public class MassTask14 {
	public static void main(String[] args) {
	
		int[][] arr = new int[8][5];
		Random rand = new Random();
	
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = rand.nextInt(90) + 10;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
