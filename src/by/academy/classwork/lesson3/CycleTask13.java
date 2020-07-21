package by.academy.classwork.lesson3;

public class CycleTask13 {
	public static void main(String... strings) {
		int sum = 0;
		for (int i = 100; i < 200; i++) {
			if (i % 17 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
