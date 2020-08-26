/*Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и 
	выводит на консоль сообщение “Отгрузили ящик с весом n”. “Отправляем ящик с весом n” 
	Используем функциональный интерфейс Consumer и метод по умолчанию andThen.*/

package by.academy.classwork.lesson12;

import java.util.function.Consumer;

public class Task6 {
	public static void main(String... strings) {
		Consumer<HeavyBox> otgr = (HeavyBox ot) -> System.out.println("Отгрузили ящик с весом " + ot.getN());
		Consumer<HeavyBox> otpr = (HeavyBox ot) -> System.out.println("Отправляем ящик с весом " + ot.getN());
		otgr.andThen(otpr).accept(new HeavyBox(7));
	}
}
