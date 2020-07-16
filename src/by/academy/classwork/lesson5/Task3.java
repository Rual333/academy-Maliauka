package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task3 {
	public static void main(String... strings) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of strings to input: ");
		int num = sc.nextInt();
		String[] str = new String[num];
		String temp;
		sc.nextLine();

		System.out.println("Enter strings: ");
		for (int i = 0; i < num; i++) {
			str[i] = sc.nextLine();
		}	
		for (int i = 0; i < num; i++) {	
			for (int j = 0; j < num; j++) {
				if (str[i].length() < str[j].length()) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}

		System.out.println("Strings that have lenght less than half: ");
		for (int i = 0; i < num/2; i++) {
			System.out.println(str[i] + "; Length: " + str[i].length());
		}
		System.out.println("Strings that have lenght more than half: ");
		for (int i = num/2; i < num; i++) {
			System.out.println(str[i] + "; Length: " + str[i].length());
		}
		
		sc.close();
	}
}
