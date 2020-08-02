/*Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
Содержит конструктор, принимающий значение int и инитает им размер нашего массива.

Содержит методы:
1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен, нам нужно его расширить с помощью Arrays.copyOf)
2) взятие по индексу get(int i)
3) взятие последнего элемента getLast()
4) взятие первого элемента getFirst()
5) вывод размера массива
6) вывод индекса последнего заполненого элемента (не путать с размерностью)
7) удаление элемента по индексу (remove(int i)
8) удаление элемента по значению (remove(T obj))*/

package by.academy.homework.homework3;

import java.util.Arrays;

public class Task2<T> {
	private T[] array;
	private int counter = 0;

	@SuppressWarnings("unchecked")
	public Task2() {
		super();
		array = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public Task2(int size) {
		super();
		array = (T[]) new Object[size];
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public void add(T item) {
		if (null == array) {
			return;
		}
		if (array.length == counter) {
			array = Arrays.copyOf(array, array.length * 2 + 1);
		}
		array[counter++] = item;
	}

	public T get(int index) {
		if (index < array.length && index >= 0) {
			return array[index];
		} else {
			System.out.println("index out of array");
			return null;
		}
	}

	public T getLast() {
		return array[array.length - 1];
	}

	public T getFirst() {
		return array[0];
	}

	public int getSize() {
		return array.length;
	}

	public void printSize() {
		System.out.println(getSize());
	}

	public void printLastNoNullElement() {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != null) {
				System.out.println(array[i]);
				return;
			}
		}
	}

	public void removeByInd(int i) {
		if (null == array || i < 0 || i > array.length - 1) {
			System.out.println("index out of array length");
			return;
		} else if (i == array.length - 1) {
			array[i] = null;
		} else {
			System.arraycopy(array, i + 1, array, i, array.length - 1 - i);
			array[array.length - 1] = null;
		}
	}

	public void removeByValue(T t) {
		if (null == array || t == null) {
			return;
		} else {
			for (int i = 0; i < array.length; i++) {
				if (t.equals(array[i])) {
					removeByInd(i);
					return;
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	public void addToEnd(T item) {
		if (null == array) {
			return;
		}
		if (array[array.length - 1] != null) {
			T[] temp = (T[]) new Object[array.length * 2 + 1];
			System.arraycopy(array, 0, temp, 0, array.length);
			temp[array.length] = item;
			counter = array.length;
			array = temp;

		} else {
			array[array.length - 1] = item;
			counter = array.length;
		}
	}

	@SuppressWarnings("unchecked")
	public void addToIndex(T item, int index) {
		if (index < 0) {
			return;
		}
		if (index > array.length - 1) {
			T[] temp = (T[]) new Object[index + 1];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}
		array[index] = item;
		counter = index + 1;
	}
}
