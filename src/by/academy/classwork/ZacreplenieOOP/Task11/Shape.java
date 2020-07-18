package by.academy.classwork.ZacreplenieOOP.Task11;

public abstract class Shape {

	private String colour;

	public Shape() {
		super();
	}

	public Shape(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public abstract void draw();
	
	public abstract void printInfo();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null) 
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shape other = (Shape) obj;
		if (colour != other.colour)
			return false;
		return true;
	}	
}
