package by.academy.homework.homework2.products;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Deal {
	private User seller;
	private User buyer;
	private final static byte BASKET_CAPACITY = 15;
	private Product[] products = new Product[BASKET_CAPACITY];
	private int current_size = 0;
	private Date deadline;
	public static SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");

	public Deal() {
		super();
		init();
	}

	public Deal(User seller, User buyer, Product products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products[0] = products;
		init();
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
		if (current_size == 0) {
			System.out.println("There are no products in the basket!");
			return;
		}
		for (int i = 0; i < products.length; i++) {
			if (null == products[i]) {
				System.out.println("There no such product in a basket");
				return;
			}
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

	public static void addToBasket(Deal deal, Scanner sc) {
		do {

			System.out.println(
					"Please enter the number of the type of products: 1. Books; 2. Nuts; 3. Tools; 4. Other products.");
			switch (sc.nextLine()) {
			case "1":
				addBooks(deal, sc);
				break;
			case "2":
				addNuts(deal, sc);
				break;
			case "3":
				addTools(deal, sc);
				break;
			case "4":
				addProduct(deal, sc);
				break;
			default:
				System.out.println("Incorrect Input");
			}
			if (deal.getCurrent_size() == Deal.getBasketCapacity()) {
				System.out.println("Basket is full");
				break;
			}
			System.out.println("Do you want to add another product to basket Y/N?");
		} while (yOrN(sc));
	}

	public static void addBooks(Deal deal, Scanner sc) {
		System.out.println("Please enter books name, price, quantity and number of pages separated by spaces: ");
		String[] npq = enterNamePriceQuantity(sc, 4);
		try {
			deal.addProduct(
					new Books(npq[0], Double.parseDouble(npq[1]), Integer.parseInt(npq[2]), Integer.parseInt(npq[3])));
		} catch (NumberFormatException e) {
			System.out.println("Incorrect Input");
		}
	}

	public static void addNuts(Deal deal, Scanner sc) {
		System.out.println("Please enter nuts name, price and weight in gramm separated by spaces: ");
		String[] npq = enterNamePriceQuantity(sc, 3);
		try {
			deal.addProduct(new Nuts(npq[0], Double.parseDouble(npq[1]), Integer.parseInt(npq[2])));
		} catch (NumberFormatException e) {
			System.out.println("Incorrect Input");
		}
	}

	public static void addTools(Deal deal, Scanner sc) {
		System.out.println("Please enter tool name, price and quantity separated by spaces: ");
		String[] npq = enterNamePriceQuantity(sc, 3);
		try {
			deal.addProduct(new Tools(npq[0], Double.parseDouble(npq[1]), Integer.parseInt(npq[2])));
		} catch (NumberFormatException e) {
			System.out.println("Incorrect Input");
		}
	}

	public static void addProduct(Deal deal, Scanner sc) {
		System.out.println("Please enter product name, price and quantity separated by spaces: ");
		String[] npq = enterNamePriceQuantity(sc, 3);
		try {
			deal.addProduct(new Product(npq[0], Double.parseDouble(npq[1]), Integer.parseInt(npq[2])));
		} catch (NumberFormatException e) {
			System.out.println("Incorrect Input");
		}
	}

	public static void removeFromBasket(Deal deal, Scanner sc) {
		do {
			System.out.println("Please enter the name of the product that you want to remove: ");
			String nameOfPr = sc.nextLine();
			deal.removeProduct(nameOfPr);
			System.out.println("Do you want to remove another product to basket Y/N?");
		} while (yOrN(sc));
	}

	private static boolean yOrN(Scanner sc) {
		String yn;
		yn = sc.nextLine();
		if (yn.toLowerCase().equals("y") || yn.toLowerCase().equals("yes")) {
			return true;
		} else {
			return false;
		}
	}

	public static void setSellerAndBuyer(Deal deal, Scanner sc) throws ParseException {
		System.out.println("Please enter the name of the seller: ");
		deal.setSeller(new User(sc.nextLine()));
		System.out.println("Please enter the name of the buyer: ");
		deal.setBuyer(new User(sc.nextLine()));
	}

	public String getStatus() {
		Calendar c = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.DAY_OF_MONTH, 8);
		if (c.getTime().after(deadline)) {
			return DealStatus.DONE.getStatus();
		} else if (c2.getTime().before(deadline)) {
			return DealStatus.NEW.getStatus();
		} else {
			return DealStatus.IN_PROGRESS.getStatus();
		}
	}
	
	private static String[] enterNamePriceQuantity(Scanner sc, int kolPar) {
		String[] temp;
		while (true) {
			temp = sc.nextLine().split(" ");
			if (temp.length == kolPar) {
				break;
			} else {
				System.out.println("Incorrect Input, can you repeat please?");
			}
		}
		return temp;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();

		if (null == seller) {
			System.out.println("You don't enter seller and buyer info!");
		} else {
			builder.append("Seller: ").append(seller.toString()).append("Buyer: ").append(buyer.toString())
					.append("\n");
		}

		if (null == products[0]) {
			System.out.println("You don't enter product info!");
		} else {
			builder.append("Total quantity of products: ").append(current_size).append("\n");
			for (int i = 0; i < current_size; i++) {
				builder.append(products[i].toString());
			}
			builder.append("Total cost is: " + getTotalCost()).append("\nDeadline: ")
					.append(dateformat.format(deadline)).append("\n");

		}

		return builder.toString();
	}
}
