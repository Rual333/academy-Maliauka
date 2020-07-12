package by.academy.lessons.lesson3;

import java.util.Random;
import java.util.Scanner;

public class MassTask13 {
	public static void main(String... strings) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int num, num2 = 0;

		do {
			System.out.println("Enter the number thet must be more than 3: ");
			num = sc.nextInt();
		} while (num < 3);
		
		int[] arr = new int[num];
	
		for (int i = 0; i < num; i++) {
			arr[i] = rand.nextInt(num + 1);
			if (arr[i] % 2 == 0) {
				num2++;
			}
			System.out.print(arr[i] + " ");
		}
	
		System.out.println();
		int[] arr2 = new int[num2];
		num2 = 0;
	
		for (int a : arr) {
			if (a % 2 == 0 && a != 0) {
				arr2[num2++] = a;
				System.out.print(a + " ");
			}
		}
		
		sc.close();
	}
}
