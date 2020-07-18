package by.academy.classwork.ZacreplenieOOP.Task11;

public class Main {
	public static void main(String...strings) {
		Shape[] shapes = {new Circle("Violet", 3, 5, 10), new Rectangle("Black", 4, 5, 10, 15)};
		for (Shape a:shapes) {
			a.draw();
			a.printInfo();
		}
	}
}
