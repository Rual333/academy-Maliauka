package by.academy.classwork.lesson8;

public class MainTask7 {

	public static void main(String... strings) {
		MatrixTask7<Double> m1 = new MatrixTask7<>(3, 5, new Double[3][5]);
		m1.fullTheMatr();
		m1.printOnScreen();

		MatrixTask7<Double> m2 = new MatrixTask7<>(5, 4, new Double[5][4]);
		m2.fullTheMatr();
		m2.printOnScreen();

		m1.addMatr(m2);
		m1.printOnScreen();

		m1.multByNum(2.0);
		m1.printOnScreen();

		m1.multTwoMatrix(m2);
		m1.printOnScreen();

		MatrixTask7<Double> m3 = new MatrixTask7<>(4, 7, new Double[4][7]);
		m3.fullTheMatr();
		m3.printOnScreen();
		m1.multTwoMatrix(m3);
		m1.printOnScreen();
	}
}
