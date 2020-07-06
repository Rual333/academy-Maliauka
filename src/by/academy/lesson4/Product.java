package by.academy.lesson4;

public class Product {
	private String name;
	private double discount;
	private double price;
	int quantity;

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public double getPrice() {
		return getFinalPrice(quantity, price);
	}

	protected double getFinalPrice(int quantity, double price) {
		double finalPrice = price * getDiscount(quantity, discount) * quantity;
		return finalPrice;
	}
	
	private double getDiscount(int quantity, double discount) {
		double finalDiscount = quantity*discount;
		return finalDiscount;
	}
	
}
