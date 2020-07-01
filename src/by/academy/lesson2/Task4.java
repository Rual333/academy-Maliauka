/*
 * Task4
 * 
 * Prints amount of week, days, hours, minutes and seconds in the variable named "s"
 * 
 * Author: Ivan Maliauka
 * 
 * Just checking push and pull
 * 
 */

package by.academy.lesson2;

public class Task4 {
	public static void main(String[] args) {
		int s = 694861;
		int sec;
		int m;
		int min, h, hour;
		int d, day, week;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hour = h % 24;
		d = (h - hour) / 24;
		day = d % 7;
		week = (d - day) / 7;
		System.out.println(week + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
	}
}
