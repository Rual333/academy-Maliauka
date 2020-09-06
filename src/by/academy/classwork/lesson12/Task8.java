/*Написать лямбда выражение, которое возвращает случайное число от 0 до 10. 
	Используем функциональный интерфейс Supplier.*/

package by.academy.classwork.lesson12;

import java.util.Random;
import java.util.function.Supplier;

public class Task8 {
	public static void main(String... strings) {
		float amount = 1.00000005F;
        float avalue = 0.00000004F;
        float result = amount - avalue;
        System.out.println(result);
		float piValue = (float)Math.PI;
	        double piValueExt = Math.PI;
	        System.out.println("Float value: " + piValue );
	        System.out.println("Double value: " + piValueExt );
		Supplier<Integer> rand = () -> new Random().nextInt(10);
		System.out.println(rand.get());
		System.out.println(rand.get());
	}
}
