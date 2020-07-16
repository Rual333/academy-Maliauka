package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter words divided by space: ");
		String[] str = sc.nextLine().split(" ");

		int min = str[0].length();
		String word = str[0];
		
		for (int i = 0; i < str.length; i++) {
			String temp = "";
			for (int j = 0; j < str[i].length(); j++) {
				if (temp.indexOf(str[i].charAt(j)) < 0) {
					temp +=str[i].charAt(j);
				}
			}
			System.out.println(temp);
			if (temp.length() < min) {
				min = temp.length();
				word = str[i];
			}
		}
		
		System.out.println(word);


		sc.close();
	}
}
