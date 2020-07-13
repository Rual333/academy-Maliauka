package by.academy.classwork.lesson3;

public class MassTask2 {
	public static void main(String... strings) {
		int[] arr = new int[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2 - 1;
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]+ " ");
		}
	}
}
