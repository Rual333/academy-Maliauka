package by.academy.classwork.lesson8;

public class MainTask8 {

	public static void main(String[] args) {
		Integer[] intArr = { 1, 2, 3, 4, 5, 6, 7 };
		MinMaxTask8<Integer> a = new MinMaxTask8<>(intArr);
		System.out.println(a.min());
		System.out.println(a.max());
		Double[] doubArr = { 1.0, 1.3, 1.5, 2.6 };
		MinMaxTask8<Double> b = new MinMaxTask8<>(doubArr);
		System.out.println(b.min());
		System.out.println(b.max());
		boolean[] wow = a.equal(b);
		for (boolean c : wow) {
			System.out.println(c);
		}
	}

}
