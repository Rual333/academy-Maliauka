/*	Переписать класс FileCopy: 
	a) Добавить блок try-with-resources. 
	б) Добавить catch блок для обработки IOException. (Задание с урока)*/

package by.academy.classwork.lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		File dir = new File("src/by/academy/classwork/lesson11/");
		File copyFrom = new File(dir.getCanonicalPath(), "file.txt");
		copyFrom.createNewFile();
		try (FileInputStream fileIn = new FileInputStream(copyFrom);
				FileOutputStream fileOut = new FileOutputStream(dir.getCanonicalPath() + "/copied_file.txt")) {
			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);
			}
		} catch (IOException e) {
			System.err.println("Something goes wrong with IO!");
		}
	}
}