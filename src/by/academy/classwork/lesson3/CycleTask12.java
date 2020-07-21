package by.academy.classwork.lesson3;

public class CycleTask12 {
	public static void main(String... strings) {
		int mult = 1;
		for (int i = 13; i < 100; i++) {
			if (i % 13 == 0 && i % 2 == 1) {
				mult *= i;
			}
		}
		System.out.println(mult);
	}
}
