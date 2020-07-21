package by.academy.classwork.lesson3;

public class CycleTask11 {
	public static void main(String... strings) {

		for (int i = 10; i < 100; i++) {
			if (i % 4 == 0 && i % 6 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
