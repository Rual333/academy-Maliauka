package by.academy.lessons.lesson3;

import java.util.Random;
import java.util.Scanner;

public class MassTask11 {
	public static void main(String... strings) {
	
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num, sum1 = 0, sum2 = 0;
	
		do {
			System.out.println("Enter the size of array, it must be a positive and even number: ");
			num = sc.nextInt();
		} while (num < 0 && num % 2 != 0);
		int[] arr = new int[num];
	
		for (int i = 0; i < arr.length / 2; i++) {
			arr[i] = rand.nextInt(11) - 5;
			System.out.print(arr[i] + " ");
			sum1 += Math.abs(arr[i]);
		}
	
		for (int i = arr.length / 2; i < arr.length; i++) {
			arr[i] = rand.nextInt(11) - 5;
			System.out.print(arr[i] + " ");
			sum2 += Math.abs(arr[i]);
		}
	
		if (sum1 > sum2) {
			System.out.println("\nThe sum of the modules of the right half is bigger");
		} else if (sum1 < sum2) {
			System.out.println("\nThe sum of the modules of the left half is bigger");
		} else {
			System.out.println("\nThe sums of the modules of the left and the right halves are equal");
		}
		
		sc.close();
	}
}
