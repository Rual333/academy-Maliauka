package by.academy.classwork.ZacreplenieOOP.Task8;

public class Veterinary {

	private String name;
	private int exp;

	public Veterinary() {
		super();
	}

	public Veterinary(String name, int exp) {
		super();
		this.setName(name);
		this.setExp(exp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void treatAnimal(Animal... animals) {
		for (int i = 0; i < animals.length; i++) {
			System.out.println("Animal: " + animals[i].getNickName() + ", food: " + animals[i].getFood() + ", location: "
					+ animals[i].getLocation());
		}
	}

}
