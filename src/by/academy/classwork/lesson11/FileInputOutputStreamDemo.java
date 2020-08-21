/*Переписать класс FileInputOutputStreamDemo: 
	a) Добавить блок try-with-resources. 
	б) Замените for (int i = 0; i < c.length; i++) на блок for-each.  
	в) Пусть file.txt записывается в каталог src/io. (Задание с урока)*/

package by.academy.classwork.lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) {
		File dir = new File("src/by/academy/classwork/lesson11/io");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		try (OutputStream output = new FileOutputStream(dir.getCanonicalPath() + "/a.txt");
				InputStream input = new FileInputStream(dir.getCanonicalPath() + "/a.txt")) {
			char[] symbols = { 'a', 'b', 'c', 'd' };
			for (int i : symbols) {
				output.write(i);
			}

			for (int i : input.readAllBytes()) {
				System.out.print((char) i + " ");
			}
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
}