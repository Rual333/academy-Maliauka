package by.academy.classwork.lesson8;

//import java.io.Serializable;
//import by.academy.classwork.ZacreplenieOOP.Task8.Animal;

//public class Task6<T extends Comparable<Integer>, V extends Animal & Serializable, K extends Number> {
public class Task6<T, V, K> {
	private T t;
	private V v;
	private K k;

	Task6() {
		super();
	}

	Task6(T t, V v, K k) {
		super();
		this.t = t;
		this.v = v;
		this.k = k;
	}

	public void printClassesNames() {
		System.out.println("Class 1:  " + t.getClass().getName() + " , class 2: " + v.getClass().getName()
				+ " , class 3: " + k.getClass().getName());
	}

}
