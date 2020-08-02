package by.academy.classwork.lesson9;

public class BoxDemo<T> {
	private T[] array;
	private int counter = 0;

	@SuppressWarnings("unchecked")
	public BoxDemo() {
		super();
		array = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public BoxDemo(int size) {
		super();
		array = (T[]) new Object[size];
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public T getItem(int index) {
		if (index < array.length && index >= 0) {
			return array[index];
		} else {
			System.out.println("index out of array");
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public void add(T item) {
		if (null == array) {
			return;
		}
		if (array.length == counter) {
			T[] temp = (T[]) new Object[array.length * 2 + 1];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}
		array[counter++] = item;
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
		counter = index+1;
	}
}
