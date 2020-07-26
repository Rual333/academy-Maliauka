package by.academy.classwork.lesson7;

import java.text.ParseException;

//import by.academy.homework.homework2.products.Deal;
//import by.academy.homework.homework2.products.Product;
//import by.academy.homework.homework2.products.User;

public class Main {

	public static void main(String[] args) throws ParseException {
//		Box<Product> prod = new Box<Product>();
//		prod.setItem(new Product("Slave Bob", 100, 2));
//		System.out.println(prod.getItem().toString());
//		Box<Deal> deal = new Box<Deal>();
//		User seller = new User("Slave Dealer");
//		User buyer = new User("White man");
//
//		deal.setItem(new Deal(seller, buyer, prod.getItem()));
//		System.out.println(deal.getItem().toString());
		
		General<Integer> intArr = new General<>(new Integer[11]);
		for (int i = 0; i< 10; i++) {
			intArr.addToArr(i);
		}
		intArr.addToArrI(15, 10);
		intArr.addToArr(13);
		intArr.addToArr(13);
		intArr.addToArr(13);
		for (int i = 0; i< intArr.getLength(); i++) {
			System.out.println(intArr.getEl(i));
		}
		
		General<String> strArr = new General<>(new String[11]);
		for (int i = 0; i< 10; i++) {
			strArr.addToArr(Integer.toString(i));
		}
		strArr.addToArrI("a ", 10);
		for (int i = 0; i< strArr.getLength(); i++) {
			System.out.println(strArr.getEl(i));
		}
	}

}
