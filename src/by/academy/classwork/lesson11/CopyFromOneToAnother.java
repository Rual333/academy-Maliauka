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
		File fileOut = new File("FileToCopyFrom.txt");
		File fileIn = new File("FileToCopyTo.txt");
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