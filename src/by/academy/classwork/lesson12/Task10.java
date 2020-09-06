package by.academy.classwork.lesson12;

import java.util.Scanner;

public class Task10 {
	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sign, and numbers separated by space");
		String[] s = sc.nextLine().split(" ");
		Calc oper = calcsw(s[0]);
		System.out.println("Result:" + oper.calculate(Integer.parseInt(s[1]), Integer.parseInt(s[2])));
		sc.close();
	}

	private static Calc calcsw(String s) {
		switch (s) {
		case "+":
			return (i, j) -> i + j;
		case "-":
			return (i, j) -> i - j;
		case "/":
			return (i, j) -> i / j;
		case "*":
			return (i, j) -> i * j;
		default:
			return (i, j) -> 0;
		}
	}

	interface Calc {
		int calculate(int i, int j);
	}
}
