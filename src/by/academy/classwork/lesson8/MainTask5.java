package by.academy.classwork.lesson8;

public class MainTask5 {
	public static void main(String[] args) {
		FoodTask5 book = new FoodTask5();
		CookableTask5 c = new CookableTask5() {
			@Override
			public void cook(String str) {
				System.out.println("I cook " + str);
			}
		};
		book.prepare(c, "London is the capital of GB");
	}
}
