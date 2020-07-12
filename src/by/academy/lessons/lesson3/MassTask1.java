package by.academy.lessons.lesson3;

public class MassTask1 {
	public static void main(String... strings) {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (i + 1) * 2;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
