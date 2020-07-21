package by.academy.classwork.lesson6;

public class Task4 {
	public static void main(String... strings) {

		String str = "";
		StringBuilder sb = new StringBuilder("");

		long startMS = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			str += " ";
		}
		long endMS = System.currentTimeMillis();
		System.out.println(endMS - startMS);

		startMS = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			sb.append(" ");
		}
		endMS = System.currentTimeMillis();
		System.out.println(endMS - startMS);
		System.out.println(str);
	}
}
