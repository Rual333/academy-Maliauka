package by.academy.classwork.ZacreplenieOOP.Task8;

public class Animal {

	protected String nickName;
	private String food;
	private String location;

	public Animal() {
		super();
	}

	public Animal(String nickName, String food, String location) {
		super();
		this.nickName = nickName;
		this.food = food;
		this.location = location;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void makeNoise() {
		System.out.println("Animal " + nickName + " is making noize");
	}

	public void eat() {
		System.out.println("Animal " + nickName + " is eating" + food);
	}
	
	public void sleep() {
		System.out.println("Animal " + nickName + " is sleeping");
	}
}
