package by.academy.homework.homework3.products;

@ProducerInfo(company = "Budapest's market", name = "products", number = 0, prodyctTypes = { "Books", "Nuts", "Tools",
		"Other products" })
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
		StringBuilder builder = new StringBuilder();
		builder.append("Product ").append(name).append(": price = ").append(price).append(", quantity = ")
				.append(quantity).append(";\n");
		return builder.toString();
	}
}
