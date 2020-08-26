/*Создать лямбда выражение, которое проверяет, что строка не пуста, 
	используя функциональный интерфейс Predicate.*/

package by.academy.classwork.lesson12;

import java.util.function.Predicate;

public class Task3 {
	public static void main(String... strings) {
		Predicate<String> noEmpty = (String str) -> !str.equals("");
		String s = "";
		System.out.println(noEmpty.test(s));
		System.out.println(noEmpty.test("this is not empty string"));
	}
}
