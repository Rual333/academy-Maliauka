package by.academy.homework.homework2.products;

public class Nuts extends Product {
	private double weightInGramm;

	public Nuts() {
		super();
	}

	public Nuts(String name, double price, int weightInGramm) {
		super(name, price, 1);
		this.weightInGramm = weightInGramm;
	}

	public double getWeightInGramm() {
		return this.weightInGramm;
	}

	public void setWeightInGramm(double weightInGramm) {
		this.weightInGramm = weightInGramm;
	}

	private double calculateDiscount() {
		if (weightInGramm > 1500) {
			discount = 0.05;
		} else if (weightInGramm > 3000) {
			discount = 0.1;
		}
		return discount;
	}

	@Override
	public double getTotalCost() {
		return weightInGramm * price / 1000 - (price / 1000 * weightInGramm * calculateDiscount());
	}

	@Override
	public String toString() {
		return "Nuts " + name + ": price: " + price + ", weight in gramm: " + weightInGramm + ", discount: "
				+ calculateDiscount() + ";\n";
	}
}
