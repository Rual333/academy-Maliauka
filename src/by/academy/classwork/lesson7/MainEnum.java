//а) Создать перечисление, содержащее названия времен года.
//б) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем. 
//в) Создать метод, который принимает на вход переменную созданного вами enum типа. Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее Используем оператор switch.
//г) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
//д) Добавить конструктор принимающий на вход среднюю температуру
//е) Создать метод getDescription, возвращающий строку “Холодное время года”. Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.

package by.academy.classwork.lesson7;

public class MainEnum {
	public static void main(String... strings) {
		String favourite = Seasons.SUMMER.seasonName;
		System.out.println(favourite);
		Seasons.AUTUMN.printInfo();
		printILove(Seasons.AUTUMN);
		System.out.println(Seasons.AUTUMN.getDescription());
		System.out.println(Seasons.SUMMER.getDescription());

		for (Seasons s : Seasons.values()) {
			s.printInfo();
		}
	}

	public static void printILove(Seasons val) {
		switch (val.seasonName) {
		case "Winter":
			System.out.println("I love winter");
			break;
		case "Spring":
			System.out.println("I love spring");
			break;
		case "Summer":
			System.out.println("I love summer");
			break;
		case "Autumn":
			System.out.println("I love autumn");
			break;

		}
	}
}
