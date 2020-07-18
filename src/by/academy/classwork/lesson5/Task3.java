package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task3 {
	public static void main(String... strings) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of strings to input: ");
		int num = sc.nextInt();
		String[] str = new String[num];
		int sum = 0;
		sc.nextLine();
		StringBuilder less = new StringBuilder();
		StringBuilder more = new StringBuilder();
		
		System.out.println("Enter strings: ");
		for (int i = 0; i < num; i++) {
			str[i] = sc.nextLine();
			sum += str[i].length();
		}
		sum /= num;
		for (int i = 0; i < num; i++) {
			if (str[i].length() < sum) {
				less.append(str[i] + "; Length: " + str[i].length()+ "\n");
			} else {
				more.append(str[i] + "; Length: " + str[i].length()+ "\n");
			}
		}
		System.out.println("Strings that have lenght less than half:\n" + less);
		System.out.println("Strings that have lenght more than half:\n" + more);
		
		sc.close();
	}

//
//	int i = 0;i<num/2;i++)
//	{
//	int i = num / 2;i<num;i++)
//	{
//		System.out.println(str[i] + "; Length: " + str[i].length());
//	}

}
