/*
 * JC1, lesson 5, Tasks 1,2:
 * 
 * Program  recording information about deal: seller and buyer names, products name, price etc., 
 * counts total cost and displays it on the screen, 
 * 
 * Author: Ivan Maliauka
 * 
 */

package by.academy.homework.homework2.products;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
	public static void main(String... strings) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi! This is a program for recording deal information. ");
		System.out.println("Please enter the number of deals you want to recording: ");
		int num = sc.nextInt();
		sc.nextLine();
		Deal[] arrDeal = new Deal[num];
		for (int i = 0; i < num; i++) {
			arrDeal[i] = new Deal();
			System.out.println("Please enter the name of the " + (i + 1) + " deal:");
			arrDeal[i].setNameOfDeal(sc.nextLine());
			System.out.println("Deal " + arrDeal[i].getNameOfDeal() + ":");
			menu(arrDeal[i], sc, arrDeal);
			writeToFile(arrDeal[i]);
		}
		sc.close();
		System.out.println("Bye!");
	}

	public static void menu(Deal deal, Scanner sc, Deal[] arrDeal) throws ParseException {

		int x = 0;
		String s = "";

		while (!"7".equals(s)) {
			System.out.println("1. To add seller and buyer info enter 1");
			System.out.println("2. To add new product into the basket enter 2");
			System.out.println("3. To remove products from basket enter 3");
			System.out.println("4. To print the result of this deal on the screen enter 4");
			System.out.println("5. To print the result of another deal on the screen enter 5");
			System.out.println("6. To print status of the deal enter 6");
			System.out.println("7. To enter info about the next deal or to exit the program enter 7");
			s = sc.nextLine();

			try {
				x = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.out.println("Неверный ввод");
			}

			switch (x) {
			case 1:
				Deal.setSellerAndBuyer(deal, sc);
				break;
			case 2:
				Deal.addToBasket(deal, sc);
				break;
			case 3:
				Deal.removeFromBasket(deal, sc);
				break;
			case 4:
				printDealInfo(deal);
				break;
			case 5:
				printDealInfo(getDealByNum(sc, arrDeal));
				break;
			case 6:
				System.out.println(getDealByNum(sc, arrDeal).getStatus());
				break;
			case 7:
				break;
			case 8:
				break;
			default:
				System.out.println("Incorrect input");
			}
		}
	}

	public static Deal getDealByNum(Scanner sc, Deal[] arrDeal) {
		System.out.println("Enter the number of the deal: ");
		int c = sc.nextInt() - 1;
		sc.nextLine();
		if (null == arrDeal[c]) {
			System.out.println("There are no information about such deal");
			return new Deal();
		}
		return arrDeal[c];
	}

	public static void printDealInfo(Deal deal) {
		if (null == deal) {
			System.out.println("There are no such deal");
		} else {
			System.out.println(deal.toString());
		}
	}

	public static void writeToFile(Deal deal) {
		File dealInfo = new File("src/by/academy/homework/homework2/deals info/" + deal.getNameOfDeal() + ".txt");
		try (PrintWriter fw = new PrintWriter(dealInfo)) {
			fw.append(deal.toString() + "\n");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
