package by.academy.lessons.lesson3;

public class MassTask7 {
	public static void main(String... strings) {
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		System.out.print(arr[0] + " " + arr[1] + " ");
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.print(arr[i] + " ");
		}
	}
}