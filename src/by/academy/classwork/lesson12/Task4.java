/*Написать программу проверяющую, что строка не null и не пуста, 
	используя метод and() функционального интерфейса Predicate.*/

package by.academy.classwork.lesson12;

import java.util.function.Predicate;

public class Task4 {

	public static void main(String[] args) {
		Predicate<String> noNull = (String str) -> str != null;
		Predicate<String> noEmpty = (String str) -> !str.equals("");
		boolean noNullAndEmpty1 = noNull.and(noEmpty).test(null);
		boolean noNullAndEmpty2 = noNull.and(noEmpty).test("");
		boolean noNullAndEmpty3 = noNull.and(noEmpty).test(" ");
		System.out.println(noNullAndEmpty1);
		System.out.println(noNullAndEmpty2);
		System.out.println(noNullAndEmpty3);
	}

}
