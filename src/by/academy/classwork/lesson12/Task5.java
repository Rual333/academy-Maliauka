/*Написать программу которая проверяет, что строка начинается буквой “J”или “N” 
	и заканчивается “A”. Используем функциональный интерфейс Predicate.*/

package by.academy.classwork.lesson12;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

	public static void main(String[] args) {
		Predicate<String> strangestr = (String s) -> {
			Pattern p = Pattern.compile("^([JN]).*A$");
			Matcher m = p.matcher(s);
			return m.find();
		};
		System.out.println(strangestr.test("not that string"));
		System.out.println(strangestr.test("Jane is not my son he is a daughter, AHAHA"));
	}

}
