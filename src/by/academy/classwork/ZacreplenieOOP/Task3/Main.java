package by.academy.classwork.ZacreplenieOOP.Task3;

public class Main {
	public static void main(String... strings) {
		Matrix m1 = new Matrix(3,5);
		m1.fullTheMatr();
		m1.printOnScreen();
		
		Matrix m2 = new Matrix(5,4);
		m2.fullTheMatr();
		m2.printOnScreen();
		
		m1.addMatr(m2);
		m1.printOnScreen();
		
		m1.multByNum(2.0);
		m1.printOnScreen();
		
		m1.multTwoMatrix(m2);
		m1.printOnScreen();
		
		Matrix m3 = new Matrix(4,7);
		m3.fullTheMatr();
		m3.printOnScreen();
		m1.multTwoMatrix(m3);
		m1.printOnScreen();
	}
}
