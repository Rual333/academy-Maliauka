package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		boolean temp;
		String word = "there were not such words";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words divided by space: ");
		String[] str = sc.nextLine().split(" ");
		sc.close();

		for (int i = 0; i < str.length; i++) {
			temp = true;
			for (int j = 0; j < str[i].length()-1; j++) {
					if (str[i].codePointAt(j) > str[i].codePointAt(j+1)) {
						temp = false;
					}
				}
			if (temp) {
				word = str[i];
				break;
			}
		}


		System.out.println("The word is: " + word);
	}

}
