package by.academy.classwork.ZacreplenieOOP.Task11;

public class Rectangle extends Shape {

	private int x;
	private int y;
	private int lenghtOfRectangle;
	private int widthOfRectangle;

	public Rectangle() {
		super();
	}

	public Rectangle(int x, int y, int lenghtOfRectangle, int widthOfRectangle) {
		super();
		this.x = x;
		this.y = y;
		this.lenghtOfRectangle = lenghtOfRectangle;
		this.widthOfRectangle = widthOfRectangle;
	}

	public Rectangle(String colour, int x, int y, int lenghtOfRectangle, int widthOfRectangle) {
		this(x, y, lenghtOfRectangle, widthOfRectangle);
		super.setColour(colour);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getLenghtOfRectangle() {
		return lenghtOfRectangle;
	}

	public void setLenghtOfRectangle(int lenghtOfRectangle) {
		this.lenghtOfRectangle = lenghtOfRectangle;
	}

	public int getWidthOfRectangle() {
		return widthOfRectangle;
	}

	public void setWidthOfRectangle(int widthOfRectangle) {
		this.widthOfRectangle = widthOfRectangle;
	}

	@Override
	public void draw() {
		System.out.println("Представьте что здесь нарисован прямоугольник");
	}

	@Override
	public void printInfo() {
		System.out.println("Прямоугольник " + this.getColour() + " цвета с центром в точке: (" + this.x + ", " + this.y
				+ "), длина и ширина: " + this.lenghtOfRectangle + " " + " " + this.widthOfRectangle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (lenghtOfRectangle != other.lenghtOfRectangle)
			return false;
		if (widthOfRectangle != other.widthOfRectangle)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
