package by.academy.lessons.lesson4;

public class Main {
	public static void main(String... strings) {
		Books triangulation = new Books("Triangulation", 100.0, 0.5, 40, 280);
		System.out.println(triangulation.toString());
		System.out.println(triangulation.getFinalPrice());
	}
}
