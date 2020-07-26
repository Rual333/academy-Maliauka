//Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.). 
//	Реализовать метод:
//	а) который возвращает элемент по индексу (проверка границ массива)
//	б) который добавляет элемент в конец массива (проверка границ массива)
//	в) который добавление элемента в массив по индексу(проверка границ, сдвиг массива)
//	нужно учесть, что если массив заполнен, увеличиваем массив в 2 раза

package by.academy.classwork.lesson7;

public class General<T extends Object> {

	private T[] t;

	public General() {
		super();
	}

	public General(T[] t) {
		this.t = t;
	}

	public T[] getT() {
		return t;
	}

	public void setT(T[] t) {
		this.t = t.clone();
	}

	public int getLength() {
		return t.length;
	}

	public T getEl(int i) {
		if (i < t.length) {
			return this.t[i];
		} else {
			System.out.println("Out of length");
			return null;
		}
	}

	public void addToArr(T a) {
		if (null == t[t.length - 1]) {
			for (int i = 0; i < t.length; i++) {
				if (null == t[i]) {
					t[i] = a;
					return;
				}
			}
		} else {
			@SuppressWarnings("unchecked")
			T[] m = (T[]) new Object[t.length + 1];
			for (int x = 0; x < t.length; x++) {
				m[x] = t[x];
			}
			m[t.length] = a;
			t = m;
		}
	}

	@SuppressWarnings("unchecked")
	public void addToArrI(T a, int i) {
		if (i < t.length && null == t[i]) {
			t[i] = a;
		} else {
			T[] m = (T[]) new Object[t.length + 1];
			if (i >= t.length) {
				int b = t.length;
				while (b <= i) {
					b *= 2;
				}
				m = (T[]) new Object[b];
			}
			for (int x = 0, y = 0; x < t.length; x++, y++) {
				if (x == i) {
					x++;
				}
				m[x] = t[y];
			}
			m[i] = a;
			t = m;
		}
	}

}
