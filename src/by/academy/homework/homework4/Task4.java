package by.academy.homework.homework4;

public class Task4 {
	public static void main(String... strings) throws CustomException {
		try {
			int[] arr = new int[8];
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array is to small, expand the array");
			throw new CustomException();
		}
	}
}
