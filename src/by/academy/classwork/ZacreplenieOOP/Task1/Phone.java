package by.academy.classwork.ZacreplenieOOP.Task1;

class Phone {
	
	private String number = "No number";
	private String model = "No model";
	private int weight;

	public Phone() {
		super();
	}

	public Phone(String number, String model, int weight) {
		this(number, model);
		this.weight = weight;
	}

	public Phone(String number, String model) {
		super();
		this.number = number;
		this.model = model;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void receiveCall(String name) {
		System.out.println("The " + name + " is calling");
	}

	public void receiveCall(String name, String number) {
		System.out.println("The " + name + " is calling. Number: " + number);
	}

	public void sendMessage(String... numbers) {
		System.out.println("Numbers for sending message:");
		for (String a : numbers) {
			System.out.println(a);
		}
	}

	@Override
	public String toString() {
		return "Model: " + model + ", number: " + number + ", weight:" + weight;
	}
}
