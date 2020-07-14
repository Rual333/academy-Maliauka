package by.academy.classwork.venicles;

import by.academy.classwork.details.Engine;
import by.academy.classwork.professions.Driver;

public class Main {
	public static void main(String[] args) {

		Engine v8 = new Engine("BMV", 4000);
		Driver vodila = new Driver("Vodila A-class", 15, 17);
		Car c1 = new Car("Volvo", "B-class", 2000, vodila, v8);

		System.out.println(c1.toString());

		c1.start();
		c1.turnLeft();
		c1.turnRight();
		c1.stop();
	}
}
