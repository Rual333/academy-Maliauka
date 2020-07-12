package by.academy.lesson5;

public class Product {
	protected double price;
	protected String name;
	protected int quantity;
	protected double discount = 0;

	public Product() {
		super();
	}

	public Product(String name, double price, int quantity) {
		super();
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalCost() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return "Product " + name + ": price: " + price + ", quantity: " + quantity + ";\n";
	}
}
