package by.academy.homework.homework2.products;

public class Deal {
	private User seller;
	private User buyer;
	private final static byte BASKET_CAPACITY = 15;
	private Product[] products = new Product[BASKET_CAPACITY];
	private int current_size = 0;

	public Deal() {
		super();
	}

	public Deal(User seller, User buyer, Product products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products[0] = products;
	}

	public Deal(User seller, User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	public User getSeller() {
		return this.seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return this.buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return this.products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public static byte getBasketCapacity() {
		return BASKET_CAPACITY;
	}

	public double getTotalCost() {
		double sum = 0;
		for (int i = 0; i < current_size; i++) {
			sum += products[i].getTotalCost();
		}
		return sum;
	}

	public int getCurrent_size() {
		return current_size;
	}

	public void addProduct(Product product) {
		if (current_size == BASKET_CAPACITY) {
			System.out.println("Basket is full");
			return;
		}
		products[current_size] = product;
		current_size++;
	}

	@Override
	public String toString() {
		String info = "Seller: " + seller.getName() + ". Buyer: " + buyer.getName() + ". Total quantity of products: "
				+ current_size + "\n";
		for (int i = 0; i < current_size; i++) {
			info += products[i].toString();
		}
		return info + "Total cost is: " + getTotalCost();
	}
}
