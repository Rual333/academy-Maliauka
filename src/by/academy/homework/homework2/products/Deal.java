package by.academy.homework.homework2.products;

import java.util.Calendar;
import java.util.Date;

public class Deal {
	private User seller;
	private User buyer;
	private final static byte BASKET_CAPACITY = 15;
	private Product[] products = new Product[BASKET_CAPACITY];
	private int current_size = 0;
	private Date deadline;

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
		init();
	}

	private void init() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 10);
		this.deadline = c.getTime();
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
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

	public void removeProduct(String nameOfProduct) {
		for (int i = 0; i < products.length; i++) {
			if (nameOfProduct.equals(products[i].name)) {
				for (int j = i; j < products.length - 1; j++) {
					products[j] = products[j + 1];
				}
				current_size--;
				return;
			}
		}
		System.out.println("There no such product in a basket");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Seller: ").append(seller.toString()).append("Buyer: ").append(buyer.toString())
				.append("Total quantity of products: ").append(current_size).append("\n");

		for (int i = 0; i < current_size; i++) {
			builder.append(products[i].toString());
		}

		builder.append("Total cost is: " + getTotalCost());

		return builder.toString();
	}
}
