package by.academy.classwork.lesson8;

public class MainTask3 {
	public static void main(String... strings) {
		UserTask3 pashka = new UserTask3("LOGAN", "Rossomakhakha");
		pashka.createQuery();
		UserTask3.Query sashka = new UserTask3.Query();
		sashka.printToLog("Once again", "I'm tired");
	}
}
