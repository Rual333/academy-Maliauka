/*Создать лямбда выражение, которое возвращает значение true, 
	если строка не null, используя функциональный интерфейс Predicate.*/

package by.academy.classwork.lesson12;

import java.util.function.Predicate;

public class Task2 {
	public static void main(String... strings) {
		Predicate<String> notNull = (String str) -> str != null;
		String s = null;
		System.out.println(notNull.test("It is no null"));
		System.out.println(notNull.test(s));
	}
}
