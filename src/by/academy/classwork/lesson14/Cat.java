/*Создать класс Cat. Создать класс Tiger, наследоваться от Cat.
Добавить public, protected, private переменные в оба класса.
Добавить public, protected, private методы в оба класса.*/

package by.academy.classwork.lesson14;

public class Cat {
	@Decription(description = "this variable is used for set length of tail  of a cat", quantity = 4)
	public int quanOfLaps;
	private int lenOfTail;
	protected String name;

	Cat() {
		super();
	}

	@SuppressWarnings("unused")
	private int getQuanOfLaps() {
		return quanOfLaps;
	}

	@SuppressWarnings("unused")
	private void setQuanOfLaps(int quanOfLaps) {
		this.quanOfLaps = quanOfLaps;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected int getLenOfTail() {
		return lenOfTail;
	}

	protected void setLenOfTail(int lenOfTail) {
		this.lenOfTail = lenOfTail;
	}

}
