package by.academy.classwork.ZacreplenieOOP.Task2;

class Person {

	private String fullName = "";
	private int age;
	
	public Person() {
		super();
	}

	public Person(String fullName, int age) {
		this.age = age;
		this.fullName = fullName;
	}
	
	public String getFullName() {
		return this.fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void move() {
		System.out.println("Person " + fullName + " is moving");
	}
	
	public void talk() {
		System.out.println("Person " + fullName + " is talking");
	}
}
