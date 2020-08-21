/*Создать руками текстовый файл, закинуть следующий текст:
"Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
+ "when an unknown printer took a galley of type and scrambled it to make a type "
+ "specimen book. It has survived not only five centuries, but also the leap into "
+ "electronic typesetting, remaining essentially unchanged. It was popularised in "
+ "the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, "
+ "and more recently with desktop publishing software like Aldus PageMaker including "
+ "versions of Lorem Ipsum."
Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы и 
записать полученный текст в result.txt.*/



package by.academy.homework.homework5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
	public static void main(String... strings) {
		File fileOut = new File("src/by/academy/homework/homework5/Task2.txt");
		File fileCopied = new File("src/by/academy/homework/homework5/Task2Copied.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(fileOut));
				FileWriter fw = new FileWriter(fileCopied)) {
			String s;
			while ((s = br.readLine()) != null) {
				s = s.replaceAll(" ", "");
				fw.write(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
