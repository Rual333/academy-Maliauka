package by.academy.classwork.lesson4;

class Product {
	public String name;
	protected double discount;
	private double price;
	protected int quantity;

	public Product() {
		super();
	}

	public Product(String name, double price, double discount, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
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
		return getFinalPrice();
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getDiscount() {
		return this.discount;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return this.quantity;
	}

	protected double getFinalPrice() {
		double finalPrice = this.price * this.quantity - (calculateDiscount(this.quantity) * this.price);
		return finalPrice;
	}

	private double calculateDiscount(int quantity) {
		double finalDiscount = 0;
		if (quantity > 0) {
			finalDiscount = getDiscount();
		} else if (quantity > 5) {
			finalDiscount = getDiscount() + 3;
		} else if (quantity > 15) {
			finalDiscount = getDiscount() + 7;
		}
		return finalDiscount;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + " Price: " + this.price + " Discount: " + getDiscount() + " Quantity: "
				+ this.quantity;
	}
}
