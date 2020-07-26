//а) Создать перечисление, содержащее названия времен года.
//б) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем. 
//в) Создать метод, который принимает на вход переменную созданного вами enum типа. Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее Используем оператор switch.
//г) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
//д) Добавить конструктор принимающий на вход среднюю температуру
//е) Создать метод getDescription, возвращающий строку “Холодное время года”. Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
//ж) В цикле распечатать все времена года, среднюю температуру и описание времени года.

package by.academy.classwork.lesson7;

public enum Seasons {
	WINTER("Winter", "12-2", -13.0), SPRING("Spring", "3-5", 5.7), SUMMER("Summer", "6-8", 20.07) {
		@Override
		public String getDescription() {
			return "Warm season";
		}

	},
	AUTUMN("Autumn", "9-11", 7.6);

	String seasonName;
	String numMonth;
	double averTemp;

	Seasons(String name, String numMonth) {
		this.seasonName = name;
		this.numMonth = numMonth;
	}

	Seasons(String name, String numMonth, double averTemp) {
		this.seasonName = name;
		this.numMonth = numMonth;
		this.averTemp = averTemp;
	}

	public String getName() {
		return this.seasonName;
	}

	public String getNumMonth() {
		return this.numMonth;
	}

	public void printInfo() {
		System.out.println("Season name: " + seasonName);
		System.out.println("Number of monthes: " + numMonth);
		System.out.println("Average temperature: " + averTemp);
		System.out.println(getDescription());
	}

	public String getDescription() {
		return "Cold season";
	}
}
