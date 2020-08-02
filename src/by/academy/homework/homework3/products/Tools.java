package by.academy.homework.homework3.products;

public class Tools extends Product {

	public Tools() {
		super();
	}

	public Tools(String name, double price, int quantity) {
		super(name, price, quantity);
		this.discount = 0;
	}

	private double calculateDiscount() {
		double sum = price * quantity;
		if (sum > 1000 && sum <= 2000) {
			discount = 0.05;
		} else if (sum > 2000) {
			discount = 0.1;
		}
		return discount;
	}

	@Override
	public double getTotalCost() {
		return price * quantity - (price * quantity * calculateDiscount());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tools ").append(name).append(": price = ").append(price).append(": quantity = ")
				.append(quantity).append(", discount = ").append(calculateDiscount()).append(";\n");
		return builder.toString();
	}
}
