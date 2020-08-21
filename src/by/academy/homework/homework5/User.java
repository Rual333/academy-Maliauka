/*Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст). 
В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию. Создайте 
каталог(папку) users и для каждого пользователя создайте файл в этом каталоге. Назовите файл 
Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в файл пользователя. 
Не забываем закрывать потоки. В блоке catch выводим сообщение ошибки на экран 
(System.err.println(e.getMessage());)
*/

package by.academy.homework.homework5;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String lastName;
	private int age;

	public User() {
		super();
	}

	public User(String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
