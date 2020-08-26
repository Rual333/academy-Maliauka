/*Написать лямбда выражение, которое принимает на вход число и возвращает значение 
	“Положительное число”, “Отрицательное число” или  “Ноль”.
	Используем функциональный интерфейс Function.*/

package by.academy.classwork.lesson12;

import java.util.function.Function;

public class Task7 {
	public static void main(String... strings) {
		Function<Integer, String> isPosOrNegOrZero = i -> (i == 0) ? "Zero"
				: (i > 0) ? "Positive value" : "Negative value";

		System.out.println(isPosOrNegOrZero.apply(5));
		System.out.println(isPosOrNegOrZero.apply(-3));
		System.out.println(isPosOrNegOrZero.apply(0));
	}
}
