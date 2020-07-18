package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task13 {
	public static void main(String... strings) {
		String[] abc = enterABC();

		int a = Integer.parseInt(abc[0]);
		int b = Integer.parseInt(abc[1]);
		int c = Integer.parseInt(abc[2]);

		double dis = findDiscriminant(a, b, c);

		System.out.println("Roots are: " + findRoots(dis, a, b, c));
	}

	public static String[] enterABC() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, b and c divided by space: ");
		String[] str = sc.nextLine().split(" ");
		sc.close();
		return str;
	}

	public static double findDiscriminant(int a, int b, int c) {
		double dis;
		dis = b * b - 4 * a * c;
		return dis;
	}

	public static String findRoots(double dis, int a, int b, int c) {
		String roots;
		double r1, r2;
		if (dis < 0) {
			roots = "No roots";
		} else {
			r1 = (-1 * b + Math.sqrt(dis)) / (2 * a);
			r2 = (-1 * b - Math.sqrt(dis)) / (2 * a);
			roots = r1 + ", " + r2;
		}
		return roots;
	}
}
