package by.academy.classwork.lesson8;

public class MainTask6 {
	public static void main(String... strings) {
		Integer i = 5;
		String s = "bye";
		Double d = 8.3;
		Task6<Integer, String, Double> iHaveNoIdea = new Task6<>(i, s, d);
		iHaveNoIdea.printClassesNames();
	}
}