package by.academy.classwork.lesson3;

public class CycleTask8 {
	public static void main(String... strings) {

		for (int i = 20; i < 50; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
