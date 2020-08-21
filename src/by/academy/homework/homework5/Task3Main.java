/* Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст). 
 В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию. 
 Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге.
 Назовите файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и 
 положите в файл пользователя. Не забываем закрывать потоки. 
 В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)*/

package by.academy.homework.homework5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task3Main {
	public static void main(String... strings) {
		File dir = new File("src/by/academy/homework/homework5/users");
		createDir(dir);
		ArrayList<User> list = new ArrayList<>();
		addUsersToList(list);
		createFilesAndSerialize(dir, list);
		serialize(dir, list);
	}

	public static void createDir(File dir) {
		if (!dir.exists()) {
			dir.mkdir();
		}
	}

	public static void addUsersToList(ArrayList<User> list) {
		for (int i = 0; i < 10; i++) {
			list.add(new User("Name", "LastName" + i, i));
		}
	}

	public static void createFilesAndSerialize(File dir, ArrayList<User> list) {
		for (User a : list) {
			File file = new File(dir, a.getName() + "_" + a.getLastName() + ".txt");
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}

	public static void serialize(File dir, ArrayList<User> list) {
		for (User a : list) {
			File file = new File(dir, a.getName() + "_" + a.getLastName() + ".txt");
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
				oos.writeObject(a);
			} catch (Exception e) {
				System.err.print(e.getMessage());
			}
		}
	}

}
