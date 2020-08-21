/*Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt). 
Считываем текст из 2-ого задания, получаем его длинну (576 символов). 
Для каждого файла генерируем рандомное число от 0 до 576, достаем из текста (из 2 задания) 
такое-же количество символов (string.substring()) и сохраняем в наш файл. 
Создайте файл result.txt и запишите туда список всех файлов и их размеры.*/

package by.academy.homework.homework5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task4 {
	public static void main(String... strings) {
		File dir = new File("src/by/academy/homework/homework5/task4");
		File copyFrom = new File(dir, "../task2.txt");
		File result = new File(dir, "result.txt");
		String task2 = readTask2(copyFrom);
		Random rand = new Random();
		makingDir(dir);
		creatingAndFilling100Files(dir, task2, rand);
		List<File> list = Arrays.asList(dir.listFiles());
		fillTheresultFile(list, result);
	}

	public static String readTask2(File task2) {
		StringBuilder s = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(task2))) {
			String temp;
			while ((temp = br.readLine()) != null) {
				s.append(temp);
			}
		} catch (IOException e) {
			System.err.println("Something goes wrong with reading the file task2");
		}
		return s.toString();
	}

	public static void makingDir(File dir) {
		if (!dir.exists()) {
			dir.mkdir();
		}
	}

	public static void creatingAndFilling100Files(File dir, String task2, Random rand) {
		for (int i = 0; i < 100; i++) {
			File file = new File(dir, "Task5 " + i + ".txt");
			if (!file.exists()) {
				try (FileWriter fr = new FileWriter(file)) {
					file.createNewFile();
					int temp = rand.nextInt(task2.length());
					fr.write(task2.substring(0, temp));
					fr.append(": " + Integer.toString(temp, 10));
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}

	public static void fillTheresultFile(List<File> list, File result) {
		try (FileWriter fw = new FileWriter(result)) {
			for (File a : list) {
				fw.append("Name: " + a.getName() + ", Length: " + a.length() + "\n");
			}
		} catch (IOException e) {
			System.err.println("Something goes wrong with adding data in result File");
		}
	}
}
