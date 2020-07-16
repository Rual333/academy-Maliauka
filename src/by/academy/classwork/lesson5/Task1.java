package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task1 {
	public static void main(String... strings) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of strings to input: ");
		int num = sc.nextInt();
		String[] str = new String[num];
		sc.nextLine();
		
		System.out.println("Enter strings: ");
		str[0] = sc.nextLine();
		
		String sMax = str[0];
		String sMin = str[0];
		
		for (int i = 1; i < num; i++) {
			str[i] = sc.nextLine();
			if (str[i].length() < sMin.length()) {
				sMin = str[i];
			} else if (str[i].length() > sMax.length()) {
				sMax = str[i];
			}
		}
		
		System.out.println("Max string: " + sMax + "; lenght: " + sMax.length());
		System.out.println("Min string: " + sMin + "; lenght: " + sMin.length());
		sc.close();
	}
}