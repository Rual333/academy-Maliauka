/*Написать класс, который копирует содержимое из одного файла в другой.
	Используем классы BufferedReader, FileReader, BufferedWriter, FileWriter.*/

package by.academy.classwork.lesson11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFromOneToAnother {
	public static void main(String[] args) {
		File dir = new File("src/by/academy/classwork/lesson11");

		File fileOut = new File(dir, "FileToCopyFrom.txt");
		if (!fileOut.exists()) {
			try {
				fileOut.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		File fileIn = new File(dir, "FileToCopyTo.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileIn));
				BufferedReader br = new BufferedReader(new FileReader(fileOut))) {
			int a;
			while ((a = br.read()) != -1) {
				bw.write(a);
			}
		} catch (IOException e) {
			System.out.println("Something goes wrong with File Reader/Writer");
		}

	}
}