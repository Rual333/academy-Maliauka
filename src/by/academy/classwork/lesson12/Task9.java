//Переделать класс использующий Printable используя ссылку на статический метод.

package by.academy.classwork.lesson12;

public class Task9 {
	public static void main(String... strings) {
		Printable pr = System.out::println;

		pr.print("hello moto");
	}
}
