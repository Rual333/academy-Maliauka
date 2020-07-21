package by.academy.classwork.lesson3;

public class CycleTask9 {
	public static void main(String... strings) {

		for (int i = 35; i < 87; i++) {
			if (i % 7 == 1 || i % 7 == 2 || i % 7 == 5) {
				System.out.print(i + " ");
			}
		}
	}
}
