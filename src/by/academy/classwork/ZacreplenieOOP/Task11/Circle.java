package by.academy.classwork.ZacreplenieOOP.Task11;

public class Circle extends Shape {

	private int x;
	private int y;
	private int radius;

	public Circle() {
		super();
	}

	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public Circle(String colour, int x, int y, int radius) {
		this(x, y, radius);
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

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void printInfo() {
		System.out.println("Круг с центром в точке: (" + this.x + ", " + this.y + "), с радиусом: " + this.radius);
	}

	@Override
	public void draw() {
		System.out.println("Представьте что здесь нарисован Михаил Круг");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj; 
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		if (radius != other.radius)
			return false;
		return true;
	}
}
