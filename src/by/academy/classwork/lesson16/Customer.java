package by.academy.classwork.lesson16;

import java.util.List;

public class Customer {
	private String name;
	private Address adress;
	private List<Payment> pay;
	private List<Order> orders;

	public Customer() {
		super();
	}

	public Customer(String name, Address adress, CreditCard creditCard, DebitCard debitCard) {
		super();
		this.name = name;
		this.adress = adress;
		pay.add(creditCard);
		pay.add(debitCard);
	}

	public Address getAdress() {
		return adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public void printInfo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [name=").append(name).append(", adress=").append(adress).append(", pay=").append(pay)
				.append(", orders=").append(orders).append("]");
		return builder.toString();
	}
}
