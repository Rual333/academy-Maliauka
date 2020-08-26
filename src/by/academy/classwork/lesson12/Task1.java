/*Написать лямбда выражение для интерфейса Printable, 
	который содержит один метод void print().*/

package by.academy.classwork.lesson12;

public class Task1 {

	public static void main(String[] args) {
		Printable pr = s -> System.out.println("It is printed by using lambda function");
		String s = "";
		pr.print(s);

	}

}

interface Printable {
	void print(String s);
}
