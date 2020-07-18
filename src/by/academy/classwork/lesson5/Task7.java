package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {

		boolean temp;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter words divided by space: ");
		String[] str = sc.nextLine().split(" ");

		for (int i = 0; i < str.length; i++) {
			temp = true;
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].lastIndexOf(String.valueOf(str[i].charAt(j))) != j) {
					temp = false;
					break;
				}
			}

			if (temp) {
				System.out.println("The word taht we need is: " + str[i]);
				break;
			}
			sc.close();
		}
	}
}
