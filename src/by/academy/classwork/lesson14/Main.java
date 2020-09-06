/*
Изменить 1 переменную класса Cat. (private)
Изменить 1 переменную класса Tiger. (не private)

Вывести на экран все переменные Cat. (private в том числе)
Вывести на экран все переменные Tiger. (private в том числе)

Добавить метод run в Tiger с private модификатором доступа, вызвать с помощью invoke().

Создать свою аннотацию, добавить 2 переменные.
Добавить аннотацию в класс Cat.
Добавить аннотацию в класс Tiger.
Вывести на экран значение из аннотации.*/

package by.academy.classwork.lesson14;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
	public static void main(String... strings) {
		Tiger tiga = new Tiger();
		Cat cotya = new Cat();
//		Создать объект Class для Cat.
		Class<Cat> catClz = Cat.class;

//		Создать объект Class для Tiger.
		Class<Tiger> tigerClz = Tiger.class;

//		Вывести на экран все методы Cat. (private в том числе) 
		Method[] methodsCat = catClz.getDeclaredMethods();
		System.out.println("Methods of Cat: ");
		for (Method h : methodsCat) {
			System.out.println(h);
		}

//		Вывести на экран все методы Tiger. (private в том числе) 
		Method[] methodTiger = tigerClz.getDeclaredMethods();
		System.out.println("Methods of Tiger: ");
		for (Method h : methodTiger) {
			System.out.println(h);
		}

//		Вывести на экран все названия переменных класса Cat. (private в том числе) 
		Field[] catFields = catClz.getDeclaredFields();
		System.out.println("Fields of Cat: ");
		for (Field h : catFields) {
			System.out.println(h);
		}

//		Вывести на экран все названия переменных класса Tiger. (private в том числе)
		Field[] tigerFields = tigerClz.getDeclaredFields();
		System.out.println("Fields of Tiger: ");
		for (Field h : tigerFields) {
			System.out.println(h);
		}

//		 Изменить 1 переменную класса Cat. (private) 
		try {
			Field catField = catClz.getDeclaredField("lenOfTail");
			catField.setAccessible(true);
			catField.set(cotya, 5);
		} catch (NoSuchFieldException | IllegalAccessException | IllegalArgumentException | SecurityException e) {
			e.printStackTrace();
		}

//		 Изменить 1 переменную класса Tiger. (не private)
		try {
			Field tigerField = tigerClz.getField("quanOfstripses");
			tigerField.set(tiga, 218);
		} catch (NoSuchFieldException | IllegalAccessException | IllegalArgumentException | SecurityException e) {
			e.printStackTrace();
		}

//		 Вывести на экран все переменные Cat. (private в том числе)
		for (Field a : catFields) {
			try {
				a.setAccessible(true);
				System.out.print(a.getName() + " ");
				System.out.println(a.get(cotya));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
//		 Вывести на экран все переменные Tiger. (private в том числе)
		for (Field a : tigerFields) {
			try {
				a.setAccessible(true);
				System.out.print(a.getName() + " ");
				System.out.println(a.get(tiga));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}

//		 Добавить метод run в Tiger с private модификатором доступа, вызвать с помощью
//		 invoke().
		try {
			Method tigaMeth = tigerClz.getDeclaredMethod("run");
			tigaMeth.setAccessible(true);
			tigaMeth.invoke(tiga);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			e.printStackTrace();
		}

//		 Создать свою аннотацию, добавить 2 переменные. Добавить аннотацию в класс
//		 Cat. Добавить аннотацию в класс Tiger. Вывести на экран значение из
//		 аннотации.
		try {
			Field catFieldForAnnotation = catClz.getDeclaredField("quanOfLaps");
			Annotation[] catAnnotation = catFieldForAnnotation.getAnnotations();
			System.out.println(catFieldForAnnotation.get(cotya));
			System.out.println(Arrays.toString(catAnnotation));
			Method tigerMethodForAnnotation = tigerClz.getDeclaredMethod("run");
			Annotation[] tigerAnnotation = tigerMethodForAnnotation.getAnnotations();
			System.out.println(Arrays.toString(tigerAnnotation));

		} catch (NoSuchFieldException | SecurityException | NoSuchMethodException | IllegalArgumentException
				| IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
