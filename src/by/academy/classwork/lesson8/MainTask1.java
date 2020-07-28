package by.academy.classwork.lesson8;

public class MainTask1 {
	public static void main(String... strings) {
		UserTask1 pashka = new UserTask1();
		pashka.createQuery("LOGAN", "Rossomakhakha");
		UserTask1.Query sashka = pashka.new Query("Robobo", "Techno");
		sashka.printToLog();
		UserTask1.Query noname = new UserTask1().new Query("Once again", "I'm tired");
		noname.printToLog();
	}
}
