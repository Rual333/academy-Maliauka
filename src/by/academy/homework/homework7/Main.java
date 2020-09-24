package by.academy.homework.homework7;

public class Main {
	public static void main(String... strings) throws InterruptedException {
		Port port1 = new Port(0);
		Producer pr1 = new Producer(port1);
		Consumer cs1 = new Consumer(port1);
		pr1.setDaemon(true);
		cs1.setDaemon(true);
		pr1.start();
		cs1.start();

		for (int i = 0; i < Port.NUMBER_OF_PIERS; i++)
			Port.AVAILABLE_PIERSES[i] = true;

		for (int i = 1; i <= 10; i++) {
			new Thread(new Ship(i, port1)).start();
			Thread.sleep(400);
		}

	}
}
