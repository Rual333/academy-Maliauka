
package by.academy.homework.homework4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Task2_3 {
	public static void main(String... strings) {
		task2();
		task3();
	}

	/*
	 * Задача 2. Создать список оценок учеников с помощью ArryList, заполнить
	 * случайными оценками. Найти самую высокую оценку с использованием итератора.
	 */
	public static void task2() {
		ArrayList<Integer> arr = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < 15; i++) {
			arr.add(rand.nextInt(100));
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		Iterator<Integer> it = arr.iterator();
		int max = 0;
		int temp;
		while (it.hasNext()) {
			temp = it.next();
			if (temp > max) {
				max = temp;
			}
		}
		System.out.println(max);
	}

	/*
	 * Задача 3. Можно писать все в main. Не нужно создавать новых классов. Имеется
	 * текст. Следует составить для него частотный словарь: Создать Map<Character,
	 * Integer> для символов, в который мы заносим символ и его количество.
	 */
	public static void task3() {
		String text = "It is just a temporary text for testing my task number 3";
		char[] chArr = text.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < chArr.length; i++) {
			putInMap(map, chArr[i]);
		}
		for (Map.Entry<Character, Integer> tempMap : map.entrySet()) {
			System.out.println("Character \'" + tempMap.getKey() + "\': quantity = " + tempMap.getValue());
		}
	}

	public static void putInMap(Map<Character, Integer> map, char ch) {
		if (null == map) {
			return;
		}
		if (map.containsKey(ch)) {
			map.put(ch, map.get(ch) + 1);
		} else {
			map.put(ch, 1);
		}
	}
}
