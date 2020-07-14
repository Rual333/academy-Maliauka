package by.academy.classwork.ZacreplenieOOP.Task8;

public class Dog extends Animal {

	private int numberOfPaws;
	private String breed;

	public Dog() {
		super();
	}

	public Dog(String nickName, String food, String location, String breed, int numberOfPaws) {
		super(nickName, food, location);
		this.setBreed(breed);
		this.setNumberOfPaws(numberOfPaws);
	}


	public int getNumberOfPaws() {
		return numberOfPaws;
	}

	public void setNumberOfPaws(int numberOfPaws) {
		this.numberOfPaws = numberOfPaws;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Dog " + nickName + " is barking");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog " + nickName + " is eating meat");
	}
}
