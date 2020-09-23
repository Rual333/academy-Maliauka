/*Необходимо создать три потока которые изменяют один и тот же объект. 
Каждый поток должен вывести на экран одну букву 100 раз, 
и затем увеличить значение символа на 1. 
a) Создать класс расширяющий Thread. 
б) Переопределить метод run(), здесь будет находится синхронизированный блок кода. 
в) Для того чтобы три объекта-потока имели доступ к одному объекту, с
оздаем конструктор принимающий на вход StringBuilder объект. 
г) Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта в). 
д) Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз, 
а потом увеличьте значение символа на 1. 
е) В методе main() создайте один объект класса StringBuilder, 
используя символ ‘a’. Затем создайте три экземпляра объекта нашего класса и запустите потоки.*/

package by.academy.classwork.lesson15;

public class Task3Main {
	

	public static void main(String... strings) {

		StringBuilder sb = new StringBuilder("a");
		ChangeInThread thread1 = new ChangeInThread(sb);
		ChangeInThread thread2 = new ChangeInThread(sb);
		ChangeInThread thread3 = new ChangeInThread(sb);
		System.out.println(sb.charAt(0));
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
