package by.academy.classwork.professions;

import by.academy.classwork.ZacreplenieOOP.Task2.*;

public class Driver extends Person {

	private int expierence;

	public Driver() {
		super();
	}

	public Driver(String fullName, int expierence, int age) {
		super(fullName, age);
		this.expierence = expierence;
	}

	public int getExpierence() {
		return this.expierence;
	}

	public void setExpierence(int expierence) {
		this.expierence = expierence;
	}

	@Override
	public String toString() {
		return super.toString() + ", expierence: " + this.expierence;
	}

}
