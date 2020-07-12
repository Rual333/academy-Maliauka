package by.academy.lesson5;

public class Tool extends Product {
	private double discount;

	public Tool() {
		super();
	}

	public Tool(String name, double price, int quantity, double discount) {
		super(name, price, quantity);
		this.discount = discount;
	}

//	@Override
//	public double getTotalCost() {
//		double sum = price * quantity;
//		if (sum > 1000 && sum <= 2000) {
//			sum = sum - sum * discount;
//		} else if (sum > 2000) {
//			sum = sum - sum * discount * 2;
//		}
//		return sum;
//	}
}
