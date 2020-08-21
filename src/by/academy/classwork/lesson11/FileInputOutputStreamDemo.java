/*Переписать класс FileInputOutputStreamDemo: 
	a) Добавить блок try-with-resources. 
	б) Замените for (int i = 0; i < c.length; i++) на блок for-each.  
	в) Пусть file.txt записывается в каталог src/io. (Задание с урока)*/

package by.academy.classwork.lesson11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) {
		try (OutputStream output = new FileOutputStream("src/io/a.txt");
				InputStream input = new FileInputStream("src/io/a.txt")) {
			char[] symbols = { 'a', 'b', 'c', 'd' };
			for (int i : symbols) {
				// Р—Р°РїРёСЃСЊ РєР°Р¶РґРѕРіРѕ СЃРёРјРІРѕР»Р° РІ С‚РµРєСЃС‚РѕРІС‹Р№ С„Р°Р№Р»
				output.write(i);
			}

			for (int i : input.readAllBytes()) {
				// Р§С‚РµРЅРёРµ С‚РµРєСЃС‚РѕРІРѕРіРѕ С„Р°Р№Р»Р° РїРѕСЃРёРјРІРѕР»СЊРЅРѕ
				System.out.print((char) i + " ");
			}
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
}