package by.academy.classwork.lesson10;

import java.util.HashMap;
import java.util.Map;

public class ToyDemo {
	public static void main(String... strings) {

		Map<String, Toy> toys = new HashMap<>();
		toys.put("Sobachka", new Toy(3.14));
		toys.put("Kotik", new Toy(5.14));
		toys.put("Elephant", new Toy(0.14));

		printPairs(toys);
		printNames(toys);
		printValues(toys);
	}

	public static void printPairs(Map<String, Toy> map) {
		for (Map.Entry<String, Toy> pairs : map.entrySet()) {
			System.out.println("Name: " + pairs.getKey() + ", " + pairs.getValue().toString());
		}
	}

	public static void printNames(Map<String, Toy> map) {
		for (String names : map.keySet()) {
			System.out.println("Name: " + names);
		}
	}

	public static void printValues(Map<String, Toy> map) {
		for (Toy value : map.values()) {
			System.out.println("Softness: " + value.toString());
		}
	}

}
