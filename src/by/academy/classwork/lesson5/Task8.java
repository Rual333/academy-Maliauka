package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		String[] str = inputWords();
		System.out.println("The word that we need is: " + numbersPalindrom(str));
	}

	public static String[] inputWords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words divided by space: ");
		String[] temp = sc.nextLine().split(" ");
		sc.close();
		return temp;
	}

	public static String numbersPalindrom(String[] str) {
		String word = "there were not such words";
		for (int i = 0; i < str.length; i++) {
			if (str[i].matches("[0-9]+")) {
				boolean temp = true;
				for (int j = 0; j < str[i].length() / 2; j++) {
					if (str[i].charAt(j) != str[i].charAt(str[i].length() - j - 1)) {
						temp = false;
						break;
					}
				}
				if (temp) {
					word = str[i];
					break;
				}
			}
		}
		return word;
	}
}
