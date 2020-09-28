package by.academy.classwork.lesson16;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String orderNo;
	private List<OrderItem> orderItems;

	public Order() {
		super();
		orderItems = new ArrayList<>();
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public void addOrderItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}

	public void removeOrderItem(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}

	public void printOrderInfo() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [orderNo=").append(orderNo).append(", orderItems=").append(orderItems).append("]");
		return builder.toString(); 
	}
}
