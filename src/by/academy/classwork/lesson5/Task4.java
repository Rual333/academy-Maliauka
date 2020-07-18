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
			StringBuilder temp = new StringBuilder();
			for (int j = 0; j < str[i].length(); j++) {
				if (temp.indexOf(String.valueOf(str[i].charAt(j))) < 0) {
					temp.append(str[i].charAt(j));
				}
			}
			if (temp.length() < min) {
				min = temp.length();
				word = str[i];
			}
		}
		
		System.out.println("The word that we need is: " + word);
		sc.close();
	}
	
	
}
