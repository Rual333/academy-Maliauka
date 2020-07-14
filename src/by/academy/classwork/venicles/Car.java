package by.academy.classwork.venicles;

import by.academy.classwork.details.*;
import by.academy.classwork.professions.*;

public class Car {

		private String marka;
		private String carClass;
		private int weight;
		private Driver driver;
		private Engine engine;

		public Car() {
			super();
		}

		public Car(String marka, String carClass, int weight, Driver driver, Engine engine) {
			super();
			this.marka = marka;
			this.carClass = carClass;
			this.weight = weight;
			this.driver = driver;
			this.engine = engine;

		}

		public String getMarka() {
			return this.marka;
		}

		public void setMarka(String marka) {
			this.marka = marka;
		}

		public String getCarClass() {
			return this.carClass;
		}

		public void setCarClass(String carClass) {
			this.carClass = carClass;
		}

		public int getWeight() {
			return this.weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public Driver getDriver() {
			return this.driver;
		}

		public void setDriver(Driver driver) {
			this.driver = driver;
		}

		public Engine getEngine() {
			return this.engine;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}

		public void start() {
			System.out.println("Go");
		}

		public void stop() {
			System.out.println("Stop");
		}

		public void turnRight() {
			System.out.println("Right turn");
		}

		public void turnLeft() {
			System.out.println("Left turn");
		}

		public void printInfo() {
			System.out.println(this.toString());
		}

		@Override
		public String toString() {
			return "Marka: " + marka + ", car class: " + carClass + ", weight: " + weight + "\nDriver info: "
					+ driver.toString() + "\nEngine info: " + engine.toString();
		}

	}

