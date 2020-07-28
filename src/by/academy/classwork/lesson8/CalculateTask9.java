package by.academy.classwork.lesson8;

public class CalculateTask9 {

	public CalculateTask9() {
		super();
	}

	public static <T extends Number, K extends Number> double sum(T t, K k) {
		return t.doubleValue() + k.doubleValue();
	}

	public static <T extends Number, K extends Number> double multiply(T t, K k) {
		return t.doubleValue() * k.doubleValue();
	}

	public static <T extends Number, K extends Number> double divide(T t, K k) {
		return t.doubleValue() / k.doubleValue();
	}

	public static <T extends Number, K extends Number> double substraction(T t, K k) {
		return t.doubleValue() - k.doubleValue();
	}

}
