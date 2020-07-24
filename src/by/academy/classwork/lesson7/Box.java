package by.academy.classwork.lesson7;

public class Box<T> {
	
	private T item;

	public Box() {
		super();
	}

	public Box (T item) {
		super();
		this.item = item;
	}
	
	public T getItem() {
		return this.item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}

}
