package by.academy.classwork.lesson9;

import java.util.Arrays;

public class BoxDemoMain {

	public static void main(String[] args) {

		BoxDemo<Integer> arr1 = new BoxDemo<>(16);
		System.out.println(arr1.getItem(5));
		arr1.add(15);
		System.out.println(arr1.getItem(0));
		arr1.addToEnd(99);
		arr1.addToIndex(155, 16);
		arr1.addToEnd(99);
//		for (Integer a : arr1.getArray()) {
//			System.out.println(a);
//		}
		System.out.println(Arrays.toString(arr1.getArray()));
		arr1.addToIndex(145, 18);
		System.out.println(Arrays.toString(arr1.getArray()));
	}

}
