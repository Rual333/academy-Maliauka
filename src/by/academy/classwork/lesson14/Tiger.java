/*Создать класс Cat. Создать класс Tiger, наследоваться от Cat.
Добавить public, protected, private переменные в оба класса.
Добавить public, protected, private методы в оба класса.*/

package by.academy.classwork.lesson14;

public class Tiger extends Cat {

	public int quanOfstripses;
	private String colour;
	protected int volume;

	public Tiger() {
		super();
	}

	@SuppressWarnings("unused")
	private int getQuanOfstripses() {
		return quanOfstripses;
	}

	@SuppressWarnings("unused")
	private void setQuanOfstripses(int quanOfstripses) {
		this.quanOfstripses = quanOfstripses;
	}

	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}

	protected int getVolume() {
		return volume;
	}

	@SuppressWarnings("unused")
	@Decription(description = "this is for running tigers", quantity = 1)
	private void run() {
		System.out.println("Tiger is running");
	}

	protected void setVolume(int volume) {
		this.volume = volume;
	}
}
