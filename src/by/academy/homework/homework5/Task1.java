/*Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл, 
если введена "stop" строка тогда закончить запись в файл.*/

package by.academy.homework.homework5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
	public static void main(String... strings) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");
		String s = sc.nextLine();
		File file = new File("src/by/academy/homework/homework5/task1.txt");
		try (FileWriter fw = new FileWriter(file)) {
			while (!"stop".equals(s)) {
				fw.write(s + "\n");
				s = sc.nextLine();
			}
		} catch (IOException e) {
			System.out.println("Wrong input");
		}
		sc.close();
	}
}
