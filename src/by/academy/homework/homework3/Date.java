/*Задание 1.
Создать объект класса Date, используя вложенные классы Год, Месяц, День. 
Методы: задать дату, вывести на консоль день недели по заданной дате. 
День недели представить в виде перечисления. 
Рассчитать количество дней, в заданном временном промежутке.
Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
После валидации в конструкторе создаем объекты класса Year, Month, Day.
Добавить метод, который проверяет высокосный ли год или нет.*/

package by.academy.homework.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {

	Pattern p = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");
	Year year;
	Month month;
	Day day;

	Date() {
		super();
	}

	Date(String date) {
		super();
		setDate(date);
	}

	Date(String day, String month, String year) {
		super();
		setDate(String.join("-", day, month, year));
	}

	public void setDate(String date) {
		if (!validateDate(date)) {
			System.out.println("Wrong date format");
			return;
		}
		year = new Year(date.substring(6));
		month = new Month(date.substring(3, 5));
		day = new Day(date.substring(0, 2));
	}

	class Year {

		short year;

		Year() {
			super();
		}

		Year(String year) {
			super();
			this.year = Short.parseShort(year);
		}

	}

	class Month {

		byte month;

		Month() {
			super();
		}

		Month(String month) {
			super();
			this.month = Byte.parseByte(month);
		}
	}

	class Day {

		byte day;

		Day() {
			super();
		}

		Day(String day) {
			super();
			this.day = Byte.parseByte(day);
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

	private boolean validateDate(String date) {
		Matcher m = p.matcher(date);
		return m.find();
	}

	public boolean isLeapYear() {
		int y = this.year.year;
		if ((y % 4 != 0) || (y % 100 == 0 && y % 400 != 0)) {
			return false;
		} else {
			return true;
		}
	}

	private int getInitCodeOfYear() {
		switch ((year.year / 100) % 4) {
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

	private int getCodeOfYear() {
		return (getInitCodeOfYear() + year.year % 100 + (year.year % 100) / 4) % 7;
	}

	private int getCodeOfMonth() {
		switch (month.month) {
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
			code = (day.day + getCodeOfMonth() + getCodeOfYear() - 1) % 7;
		} else {
			code = (day.day + getCodeOfMonth() + getCodeOfYear()) % 7;
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

	public int getDaysinYear() {
		int y = year.year - 1;
		int m = month.month;
		int d = day.day;
		int result = y * 365 + (y / 4) + d;
		for (int i = 1; i < m; i++) {
			result += getNumDays(i);
		}
		if (isLeapYear() && month.month > 3) {
			result++;
		}
		return result;
	}

	private int getNumDays(int m) {
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

	public int calculateInterval(Date anotherDate) {
		int daysInThisDate = getDaysinYear();
		int daysInAnotherDate = anotherDate.getDaysinYear();
		return Math.abs(daysInThisDate - daysInAnotherDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Day: ").append(day.day).append(" Month: ").append(month.month).append(" Year: ").append(year.year);
		return sb.toString();
	}

}
