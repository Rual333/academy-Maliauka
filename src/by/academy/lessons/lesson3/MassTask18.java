package by.academy.lessons.lesson3;

import java.util.Random;

public class MassTask18 {
	public static void main(String[] args) {

		Random rand = new Random();
		int[] arr1 = new int[15];
		int[] arr2 = new int[15];
		
		for (int i = 0; i < 15; i++) {
			arr1[i] = rand.nextInt(8) + 2;
			arr2[i] = rand.nextInt(8) + 2;
			for (int j = 0; j < i; j++) {
				while ((arr1[i] == arr2[j] && arr2[i] == arr1[j]) || (arr1[i] == arr1[j] && arr2[i] == arr2[j])) {
					arr1[i] = rand.nextInt(8) + 2;
					arr2[i] = rand.nextInt(8) + 2;			
				} 
			}
			System.out.println(arr1[i] + " x " + arr2[i] + " = " + arr1[i] * arr2[i]);
		}
	}
}
