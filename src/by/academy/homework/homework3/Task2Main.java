package by.academy.homework.homework3;

import java.util.Arrays;

public class Task2Main {
	public static void main(String[] args) {

		Task2<Double> arr1 = new Task2<>(5);
		System.out.println(Arrays.toString(arr1.getArray()));
		arr1.addToEnd(99.0);
		arr1.add(15.0);
		System.out.println(Arrays.toString(arr1.getArray()));
		arr1.printLastNoNullElement();
		arr1.addToIndex(155.0, 7);
		arr1.printLastNoNullElement();
		System.out.println(Arrays.toString(arr1.getArray()));
		arr1.addToIndex(145.0, 7);
		System.out.println(Arrays.toString(arr1.getArray()));
		arr1.removeByInd(8);
		System.out.println(Arrays.toString(arr1.getArray()));
		arr1.removeByValue(15.0);
		System.out.println(Arrays.toString(arr1.getArray()));
		System.out.println(arr1.get(7));
	}

}