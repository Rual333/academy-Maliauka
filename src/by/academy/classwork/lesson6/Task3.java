package by.academy.classwork.lesson6;

import java.util.Scanner;

public class Task3 {
	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String[] str = sc.nextLine().trim().split(" +");
		sc.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i].charAt(str[i].length()-1));
		}
		System.out.println(sb);
	}
}
