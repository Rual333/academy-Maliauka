/*Задание 1.
Создать объект класса Date, используя вложенные классы Год, Месяц, День. 
Методы: задать дату, вывести на консоль день недели по заданной дате. 
День недели представить в виде перечисления. 
Рассчитать количество дней, в заданном временном промежутке.
Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
После валидации в конструкторе создаем объекты класса Year, Month, Day.
Добавить метод, который проверяет высокосный ли год или нет.*/

package by.academy.homework.homework3;

public class MyCustomDate {

	Year year;
	Month month;
	Day day;

	public MyCustomDate() {
		super();
	}

	public MyCustomDate(String date) {
		super();
		setDate(date);
	}

	public MyCustomDate(int y, int m, int d) {
		super();
		year = new Year(y);
		month = new Month(m);
		day = new Day(d);
	}

	public void setDate(String date) {
		year = new Year(date.substring(6));
		month = new Month(date.substring(3, 5));
		day = new Day(date.substring(0, 2));
	}

	public void setYear(int y) {
		this.year.year = y;
	}

	public int getYear() {
		return this.year.year;
	}

	public void setMonth(int m) {
		this.month.month = m;
	}

	public int getMonth() {
		return this.month.month;
	}

	public void setDay(int d) {
		this.day.day = d;
	}

	public int getDay() {
		return this.day.day;
	}

	class Year {

		int year;

		Year() {
			super();
		}

		Year(String year) {
			super();
			this.year = Integer.parseInt(year);
		}

		Year(int year) {
			super();
			this.year = year;
		}

	}

	class Month {

		int month;

		Month() {
			super();
		}

		Month(String month) {
			super();
			this.month = Integer.parseInt(month);
		}

		Month(int month) {
			super();
			this.month = month;
		}

	}

	class Day {

		int day;

		Day() {
			super();
		}

		Day(String day) {
			super();
			this.day = Integer.parseInt(day);
		}

		Day(int day) {
			super();
			this.day = day;
		}
	}

	enum WeekDays {
		MON("Monday"), TUE("Tuesday"), WED("Wednesday"), THU("Thursday"), FRI("Friday"), SAT("Saturday"), SUN("Sunday");

		private String name;

		WeekDays(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	public boolean isLeapYear() {
		int y = this.year.year;
		if ((y % 4 != 0) || (y % 100 == 0 && y % 400 != 0)) {
			return false;
		} else {
			return true;
		}
	}

	private static int getInitCodeOfYear(MyCustomDate date) {
		switch ((date.getYear() / 100) % 4) {
		case 0:
			return 6;
		case 1:
			return 4;
		case 2:
			return 2;
		case 3:
			return 0;
		default:
			System.out.println("Wrong year");
			return 0;
		}
	}

	private static int getCodeOfYear(MyCustomDate date) {
		return (getInitCodeOfYear(date) + date.getYear() % 100 + (date.getYear() % 100) / 4) % 7;
	}

	private static int getCodeOfMonth(MyCustomDate date) {
		switch (date.getMonth()) {
		case 1:
			return 1;
		case 2:
			return 4;
		case 3:
			return 4;
		case 4:
			return 0;
		case 5:
			return 2;
		case 6:
			return 5;
		case 7:
			return 0;
		case 8:
			return 3;
		case 9:
			return 6;
		case 10:
			return 1;
		case 11:
			return 4;
		case 12:
			return 6;
		default:
			System.out.println("Wrong month");
			return 0;
		}
	}

	public void printDayOfWeek() {
		int code;
		if (isLeapYear() && month.month < 3) {
			code = (day.day + getCodeOfMonth(this) + getCodeOfYear(this) - 1) % 7;
		} else {
			code = (day.day + getCodeOfMonth(this) + getCodeOfYear(this)) % 7;
		}
		System.out.println(getWeekDayName(code));
	}

	private String getWeekDayName(int code) {
		switch (code) {
		case 0:
			return WeekDays.SAT.name;
		case 1:
			return WeekDays.SUN.name;
		case 2:
			return WeekDays.MON.name;
		case 3:
			return WeekDays.TUE.name;
		case 4:
			return WeekDays.WED.name;
		case 5:
			return WeekDays.THU.name;
		case 6:
			return WeekDays.FRI.name;
		default:
			return "";
		}
	}

	public static int getDaysinYear(MyCustomDate date) {
		int y = date.getYear() - 1;
		int m = date.getMonth();
		int d = date.getDay();
		int result = y * 365 + (y / 4) + d;
		for (int i = 1; i < m; i++) {
			result += getNumDays(i);
		}
		if (date.isLeapYear() && m > 3) {
			result++;
		}
		return result;
	}

	private static int getNumDays(int m) {
		switch (m) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 4, 6, 9, 11:
			return 30;
		case 2:
			return 28;
		default:
			System.out.println("Wrong date");
			return 0;
		}
	}

	public static int calculateInterval(MyCustomDate date, MyCustomDate anotherDate) {
		int daysInThisDate = getDaysinYear(date);
		int daysInAnotherDate = getDaysinYear(anotherDate);
		return Math.abs(daysInThisDate - daysInAnotherDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Day: ").append(day.day).append(" Month: ").append(month.month).append(" Year: ").append(year.year);
		return sb.toString();
	}

}
