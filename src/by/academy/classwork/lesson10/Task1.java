package by.academy.classwork.lesson10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Task1 {
	public static void main(String... strings) {
		List<Integer> list = new ArrayList<>(List.of(1, 2, 4, 7, 6, 6));
		LinkedList<String> list2 = new LinkedList<>(List.of("a", "a", "a", "uy"));
		System.out.println(getSetCollection(list));
		System.out.println(getSetCollection(list2));

		ArrayList<Integer> arList = new ArrayList<>();
		LinkedList<Integer> linList = new LinkedList<>();

		Long start, stop;

		start = System.nanoTime();
		add1000000Elements(arList);
		stop = System.nanoTime();
		System.out.println(stop - start);

		start = System.nanoTime();
		add1000000Elements(linList);
		stop = System.nanoTime();
		System.out.println(stop - start);

		start = System.nanoTime();
		get1000000Elements(arList);
		stop = System.nanoTime();
		System.out.println(stop - start);

		start = System.nanoTime();
//		get1000000Elements(linList);
		stop = System.nanoTime();
		System.out.println(stop - start);

		Map<String, Integer> catalog = new HashMap<>();

		putInMap(catalog, "D");
		putInMap(catalog, "A");
		putInMap(catalog, "A");
		putInMap(catalog, "B");
		putInMap(catalog, "C");
		putInMap(catalog, "B");

		for (String key : catalog.keySet()) {
			System.out.println(catalog.get(key) + " ");
		}

	}

	public static <T> Collection<T> getSetCollection(Collection<T> list) {
		Set<T> hashSet = new HashSet<>();
		hashSet.addAll(list);
		list.removeAll(list);
		list.addAll(hashSet);
		return list;
	}

	@SuppressWarnings("unchecked")
	public static <T> void add1000000Elements(Collection<T> list) {
		T t = (T) new Object();
		for (int i = 0; i < 1000000; i++) {
			list.add(t);
		}
	}

	@SuppressWarnings({ "unused", "unchecked" })
	public static <T> void get1000000Elements(List<T> list) {
		Random temp = new Random();
		T t = (T) new Object();
		for (int i = 0; i < 1000000; i++) {
			t = list.get(temp.nextInt(10000));
		}
	}

	public static void putInMap(Map<String, Integer> catalog, String product) {
		if (null == catalog) {
			return;
		}
		if (catalog.containsKey(product)) {
			catalog.put(product, catalog.get(product) + 1);
		} else {
			catalog.put(product, 1);
		}
	}
}