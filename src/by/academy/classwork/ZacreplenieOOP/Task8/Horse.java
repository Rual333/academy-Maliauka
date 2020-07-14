package by.academy.classwork.ZacreplenieOOP.Task8;

public class Horse extends Animal {

	private String breed;
	private String colour;
	private boolean savvyness;

	public Horse() {
		super();
	}

	public Horse(String nickName, String food, String location, String breed, String colour, boolean savvyness) {
		super(nickName, food, location);
		this.breed = breed;
		this.colour = colour;
		this.savvyness = savvyness;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean getSavvyness() {
		return savvyness;
	}

	public void setSavvyness(boolean savvyness) {
		this.savvyness = savvyness;
	}

	@Override
	public void makeNoise() {
		System.out.println("Horse " + nickName + " is neighing");
	}

	@Override
	public void eat() {
		System.out.println("Horse " + nickName + " is eating hay and straw");
	}
}
