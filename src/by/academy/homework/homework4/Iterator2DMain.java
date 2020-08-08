/*Задача 1.
Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
Протестировать в main.*/

package by.academy.homework.homework4;

public class Iterator2DMain {

	public static void main(String[] args) {
		Integer[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		Iterator2D<Integer> arrIter = new Iterator2D<Integer>(arr);
		while (arrIter.hasNext()) {
			System.out.println(arrIter.next());
		}

	}

}
