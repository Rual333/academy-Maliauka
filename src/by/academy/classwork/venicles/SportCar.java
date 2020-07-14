package by.academy.classwork.venicles;

import by.academy.classwork.details.*;
import by.academy.classwork.professions.*;

public class SportCar extends Car {
	private int speed;

	public SportCar() {
		super();
	}

	public SportCar(String marka, String carClass, int weight, Driver driver, Engine engine, int speed) {
		super(marka, carClass, weight, driver, engine);
		this.speed = speed;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
	return super.toString() + ", speed: " + speed;
	}

}
