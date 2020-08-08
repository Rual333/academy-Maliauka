package by.academy.classwork.lesson10;

import java.util.Set;
import java.util.TreeSet;

public class HeavyBoxDemo {
	public static void main(String... strings) {
		Set<HeavyBox> treeSet = new TreeSet<>();
		treeSet.add(new HeavyBox(12, 1, 1, 12));
		treeSet.add(new HeavyBox(1, 1, 1, 11));
		treeSet.add(new HeavyBox(1, 1, 1, 10));
		treeSet.add(new HeavyBox(3, 1, 1, 10));
		for (HeavyBox a : treeSet) {
			System.out.println(a.toString());
		}

	}
}
