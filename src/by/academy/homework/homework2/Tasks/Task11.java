package by.academy.homework.homework2.Tasks;

import java.util.Scanner;

public class Task11 {

	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		String s1 = enterWords(sc);
		String s2 = enterWords(sc);
		System.out.println(s1.substring(0, s1.length() / 2) + s2.substring(s2.length() / 2));
		sc.close();

	}

	private static String enterWords(Scanner sc) {
		while (true) {
			System.out.println("Please enter a word with even number of letters:");
			String str = sc.next();
			if (str.length() % 2 == 0) {
				return str;
			} else {
				System.out.println("Your word haven't even number of letter");
			}
		}
	}
}