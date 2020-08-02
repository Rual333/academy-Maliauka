package by.academy.homework.homework3;

public class DateMain {
	public static void main(String... strings) {
		Date date = new Date("02-08-0005");
		System.out.println(date.toString());
		System.out.println(date.isLeapYear());
		date.printDayOfWeek();
//		date.setDate("28-08-2020");
		date.printDayOfWeek();
		Date date2 = new Date("20", "05", "2009");
		date2.printDayOfWeek();
		System.out.println(date.calculateInterval(date2));
	}
}
