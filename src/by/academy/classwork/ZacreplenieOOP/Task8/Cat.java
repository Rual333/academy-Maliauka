package by.academy.classwork.ZacreplenieOOP.Task8;

public class Cat extends Animal {

	private int chastotaMurchania;
	private String colour;
	private String furriness;

	public Cat() {
		super();
	}

	public Cat(String nickName, String food, String location, int chastotaMurchania, String colour, String furriness) {
		super(nickName, food, location);
		this.chastotaMurchania = chastotaMurchania;
		this.colour = colour;
		this.furriness = furriness;
	}

	public int getChastotaMurchania() {
		return chastotaMurchania;
	}

	public void setChastotaMurchania(int chastotaMurchania) {
		this.chastotaMurchania = chastotaMurchania;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getPushistost() {
		return furriness;
	}

	public void setPushistost(String pushistost) {
		this.furriness = pushistost;
	}

	@Override
	public void makeNoise() {
		System.out.println("Cat " + nickName + " is meowing");
	}

	@Override
	public void eat() {
		System.out.println("Cat " + nickName + " is eating fish and drinking milk");
	}
}
