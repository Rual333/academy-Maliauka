package by.academy.homework.homework2.products;

public class Books extends Product {
	private int numOfPages;

	public Books() {
		super();
	}

	public Books(String name, double price, int quantity) {
		super(name, price, quantity);
		this.numOfPages = 0;
	}

	public Books(String name, double price, int quantity, int numOfPages) {
		super(name, price, quantity);
		this.numOfPages = numOfPages;
	}

	public int getNumOfPages() {
		return this.numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	private double calculateDiscount() {
		double finalDiscount = discount;
		if (numOfPages > 250) {
			finalDiscount += 0.05;
		}
		if (quantity > 5) {
			finalDiscount += 0.05;
		}
		return finalDiscount;
	}

	@Override
	public double getTotalCost() {
		return quantity * price - (price * quantity * calculateDiscount());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Books ").append(name).append(": price = ").append(price).append(", quantity = ").append(price)
				.append(", number of pages = ").append(numOfPages).append(", discount = ").append(calculateDiscount())
				.append(";\n");
		return builder.toString();
	}

}
