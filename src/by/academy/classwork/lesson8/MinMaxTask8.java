package by.academy.classwork.lesson8;

public class MinMaxTask8<T extends Number> {

	private T[] arr;
	private T minMax;

	MinMaxTask8() {
		super();
	}

	MinMaxTask8(T[] arr) {
		super();
		this.arr = arr;
	}

	public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}

	public T min() {
		minMax = arr[0];
		for (T a : arr) {
			if (a.doubleValue() < minMax.doubleValue()) {
				minMax = a;
			}
		}
		return minMax;
	}

	public T max() {
		minMax = arr[0];
		for (T a : arr) {
			if (a.doubleValue() > minMax.doubleValue()) {
				minMax = a;
			}
		}
		return minMax;
	}

	public boolean[] equal(MinMaxTask8<?> b) {
		int minL;
		if (this.arr.length > b.arr.length) {
			minL = b.arr.length;
		} else {
			minL = this.arr.length;
		}
		boolean[] tf = new boolean[b.arr.length];
		for (int i = 0; i < minL; i++) {
			tf[i] = (this.arr[i].doubleValue() == b.arr[i].doubleValue());
		}
		return tf;
	}

}
