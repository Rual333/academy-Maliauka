package by.academy.classwork.lesson10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Task1 {
	public static void main(String... strings) {
		List<Integer> list = new ArrayList<>(List.of(1, 2, 4, 7, 6, 6));
		LinkedList<String> list2 = new LinkedList<>(List.of("a", "a", "a", "uy"));
		System.out.println(getSetCollection(list));
		System.out.println(getSetCollection(list2));

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

}
