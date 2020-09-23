package by.academy.homework.homework7;

public class Store {
	private int storage;

	Store(int storeCapacity) {
		super();
		this.storage = storeCapacity;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storeCapacity) {
		this.storage = storeCapacity;
	}

	public void incrementStorage() {
		storage++;
	}

	public void decrementStorage() {
		storage--;
	}
}
