package by.academy.lessons.lesson3;

import java.util.Random;

public class MassTask12 {
	public static void main(String... strings) {
	
		int[] arr = new int[12];
		byte half1 = 6;
		byte half2 = 6;
		int temp;
		Random rand = new Random();
	
		for (int i = 0; i < arr.length; i++) {
			while (true) {
				temp = rand.nextInt(21) - 10;
				if (temp > 0 && half1 != 0) {
					arr[i] = temp;
					half1--;
					break;
				} else if (temp < 0 && half2 != 0) {
					arr[i] = temp;
					half2--;
					break;
				}
			}
			System.out.print(arr[i] + " ");
		}
		
	}
}
