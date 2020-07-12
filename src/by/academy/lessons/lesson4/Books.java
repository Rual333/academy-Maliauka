package by.academy.lessons.lesson4;

class Books extends Product {

	private int numberOfPages = 0;

	public Books() {
		super();
	}

	public Books(String name, double price, double discount, int quantity, int numberOfPages) {
		super(name, price, discount, quantity);
		this.numberOfPages = numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getNumberOfPages() {
		return this.numberOfPages;
	}

	@Override
	public double getDiscount() {
		if (numberOfPages > 250) {
			return this.discount + 5;
		}
		return this.discount;
	}

}
