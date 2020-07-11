package by.academy.lesson5;

import java.util.Scanner;

public class Main {
	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		Deal deal = new Deal();
		setSellerAndBuyer(deal, sc);
		addToBasket(deal, sc);
		System.out.println(deal.toString());
		sc.close();

	}

	public static void addToBasket(Deal deal, Scanner sc) {
		boolean wantToAdd;
		String yn;
		do {
			wantToAdd = false;
			System.out.println("Please enter product name, price and quantity separated by spaces: ");
			String[] npq = sc.nextLine().split(" ");
			deal.addProduct(new Product(npq[0], Double.parseDouble(npq[1]), Integer.parseInt(npq[2])));
			if (deal.getCurrent_size() == Deal.getBasketCapacity()) {
				System.out.println("Basket is full");
				break;
			}
			System.out.println("Do you want to add another product to basket Y/N?");
			yn = sc.nextLine();
			if (yn.toLowerCase().equals("y") || yn.toLowerCase().equals("yes")) {
				wantToAdd = true;
			}
		} while (wantToAdd);

	}

	public static void setSellerAndBuyer(Deal deal, Scanner sc) {
		System.out.println("This is a program for recording deal information. Basket capasity is 15");
		System.out.println("Please enter the name of the seller: ");
		deal.setSeller(new User(sc.nextLine()));
		System.out.println("Please enter the name of the buyer: ");
		deal.setBuyer(new User(sc.nextLine()));

	}
}
