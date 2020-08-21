/*Написать метод который циклически просматривает содержимое заданного каталога
	и выводит на печать информацию о всех файлах и каталогах, находящихся в нем и 
	в его подкаталогах. Используем рекурсию.*/

package by.academy.classwork.lesson11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Task5 {

	private static void lookForFiles(File dir, String indent) {
		List<File> list = Arrays.asList(dir.listFiles());
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		for (File f : list) {
			Date date = new Date(f.lastModified());
			if (f.isDirectory()) {
				System.out.println(indent + "dir:" + f.getName() + "  " + dateformat.format(date));
				lookForFiles(f, indent + "   ");
			} else {
				System.out.println(indent + "file:" + f.getName() + "  " + dateformat.format(date));
			}
		}
	}

	public static void main(String... strings) {
		File dir = new File("src");
		lookForFiles(dir, " ");
	}
}
