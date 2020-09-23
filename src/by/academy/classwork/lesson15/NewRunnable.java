/*Создать класс, реализующий интерфейс Runnable. 
Переопределить run() метод. Создать цикл for. 
В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка. 
Используем статический метод Thread.sleep() чтобы сделать паузу. 
Создать три потока, выполняющих задачу распечатки значений.*/

package by.academy.classwork.lesson15;

public class NewRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 10; i < 100; i += 10) {
			System.out.println(i);
		}

	}

}
