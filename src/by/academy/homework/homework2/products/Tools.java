package by.academy.homework.homework2.products;

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
		return "Tools " + name + ": price: " + price + ", quantity: " + quantity + ", discount: "
				+ calculateDiscount() + ";\n";
	}
}
