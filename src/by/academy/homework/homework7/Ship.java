package by.academy.homework.homework7;

import java.util.concurrent.Semaphore;

public class Ship extends Thread {
	public static final int CARRYING = 8;
	private int shipNum;
	private int capacity = 3;
	private int needToPut = 3;
	private int needToGet = 5;
	private Port port;

	public static Semaphore SEMAPHORE = new Semaphore(Port.NUMBER_OF_PIERS, true);

	Ship(int shipNum, Port port) {
		this.shipNum = shipNum;
		this.port = port;
	}

	public int getShipNum() {
		return this.shipNum;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public void run() {
		try {
			while (needToGet != 0 && needToGet != 0) {
				SEMAPHORE.acquire();
				System.out.println(shipNum + " ship checks free port");
				Thread.currentThread().setName("Ship " + shipNum);
				int numOfPort = -1;
				synchronized (Port.AVAILABLE_PIERSES) {

					for (int i = 0; i < Port.NUMBER_OF_PIERS; i++)
						if (Port.AVAILABLE_PIERSES[i]) {
							Port.AVAILABLE_PIERSES[i] = false;
							numOfPort = i;
							System.out.printf("\t\tship %d in port %d.\n", shipNum, i);
							break;
						}
				}
				while (capacity > 0 && needToPut > 0 && port.getQuantityOfContainers() < Port.STORE_CAPACITY) {
					port.putContainer();
					System.out.println("Ship" + shipNum + " put container in store, containers in store: "
							+ port.getQuantityOfContainers());
					needToPut--;
					capacity--;
				}

				sleep(1000);
				while (capacity < CARRYING && needToGet > 0 && port.getQuantityOfContainers() > 0) {
					port.getContainer();
					System.out.println("Ship" + shipNum + " get container in store, containers in store: "
							+ port.getQuantityOfContainers());
					needToGet--;
					capacity--;
				}
				sleep(1000);
				synchronized (Port.AVAILABLE_PIERSES) {
					Port.AVAILABLE_PIERSES[numOfPort] = true;
				}

			}
			SEMAPHORE.release();
			System.out.println("Ship" + shipNum + " performed loading/unloading operation");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
