package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		int kol1 = 0, kol2 = 0, temp;
		String vowels = "aeiouyAEIOUY";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words divided by space: ");
		String[] str = sc.nextLine().split(" ");
		sc.close();

		for (int i = 0; i < str.length; i++) {
			if (str[i].matches("[a-zA-Z]+")) {
				kol1++;
				temp = 0;

				if (str[i].length() % 2 != 0) {
					continue;
				}

				for (int j = 0; j < str[i].length(); j++) {
					if (vowels.indexOf(str[i].charAt(j)) >= 0) {
						temp++;
					}
				}

				if (temp == str[i].length() / 2) {
					kol2++;
				}
			}

		}

		System.out.println("The number of words that contains only letters of latin alphabet: " + kol1);
		System.out.println("The number of words with equal number of vowel and consonant letters is: " + kol2);

	}
}
