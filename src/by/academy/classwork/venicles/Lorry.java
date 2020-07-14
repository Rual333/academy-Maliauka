package by.academy.classwork.venicles;

import by.academy.classwork.details.*;
import by.academy.classwork.professions.*;

public class Lorry extends Car {
	private int carrying;

	public Lorry() {
		super();
	}

	public Lorry(String marka, String carClass, int weight, Driver driver, Engine engine, int carrying) {
		super(marka, carClass, weight, driver, engine);
		this.carrying = carrying;
	}

	public int getCarrying() {
		return this.carrying;
	}

	public void setCarrying(int carrying) {
		this.carrying = carrying;
	}

	@Override
	public String toString() {
		return super.toString() + ", carrying: " + carrying;
	}

}
