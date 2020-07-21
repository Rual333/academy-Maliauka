package by.academy.classwork.lesson3;

public class CycleTask10 {
	public static void main(String... strings) {

		int sum = 0;
		for (int i = 1; i < 50; i++) {
			if (i % 5 == 0 || i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
