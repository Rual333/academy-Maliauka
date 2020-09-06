/*a)	Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth 
b)	Добавить класс User, который наследуется от Person, с полями: login, password, email
c)	Добавить гетеры, сетеры. Добавить метод printUserInfo в User. Вывести с помощью рефлексии все поля и
методы, сначала через 
getMethod("name")
getMethods()
getField("name")
getFields()
а затем через 
getDeclaredMethod("name")
getDeclaredMethods()
getDeclaredField("name")
getDeclaredFields()
Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field). 
Вывести значения полей через Reflection. (get метод класса Field). Вызвать toString через invoke.*/

package by.academy.homework.homework6;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Task2 {
	@SuppressWarnings("deprecation")
	public static void main(String... strings) {

		User user = new User();
		Person person = new Person();

		Class<Person> personClass = Person.class;
		Class<User> userClass = User.class;

		try {

			printClassMethods(userClass);
			printClassMethods(personClass);
			printClassFields(userClass);
			printClassFields(personClass);
			int count = 0;
			Field[] userFields = userClass.getDeclaredFields();
			System.out.println("User's fields: ");
			for (Field a : userFields) {
				a.setAccessible(true);
				a.set(user, ++count + "");
				System.out.println(a.getName() + " " + a.get(user));
			}
			System.out.println("Person's fields: ");
			Field[] personFields = personClass.getDeclaredFields();
			for (Field a : personFields) {
				try {
					a.setAccessible(true);
					if (a.getType() == int.class) {
						a.set(person, 5);
						continue;
					}
					if (Date.class == a.getType()) {
						a.set(person, new Date(120, 11, 19));
						continue;
					}
					a.set(person, ++count + "");
				} finally {
					System.out.println(a.getName() + " " + a.get(person));
				}
			}
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Method userPrintUserInfo = userClass.getDeclaredMethod("printUserInfo");
			userPrintUserInfo.setAccessible(true);
			userPrintUserInfo.invoke(user);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public static void printClassMethods(Class<? extends Person> clas) {
		String s = clas.getName().toString().replaceAll("by.academy.homework.homework6.", "");

		System.out.println(s + " methods: ");
		Method[] methods = clas.getMethods();
		printMethodsAndFields(methods);
		System.out.println();

		System.out.println(s + " declared methods: ");
		Method[] declaredMethods = clas.getDeclaredMethods();
		printMethodsAndFields(declaredMethods);
		System.out.println();
	}

	public static void printClassFields(Class<? extends Person> clas) {
		String s = clas.getName().toString().replaceAll("by.academy.homework.homework6.", "");

		System.out.println(s + " fields: ");
		Field[] methods = clas.getFields();
		printMethodsAndFields(methods);
		System.out.println();

		System.out.println(s + " declared fields: ");
		Field[] declaredMethods = clas.getDeclaredFields();
		printMethodsAndFields(declaredMethods);
		System.out.println();
	}

	public static void printMethodsAndFields(AccessibleObject[] a) {
		if (a.length == 0) {
			System.out.println("There are no methods or fields");
			return;
		}
		for (AccessibleObject b : a) {
			System.out.println(b.toString().replaceAll("(by.academy.homework.homework6.)?(java.lang.)?", ""));
		}
	}

}
