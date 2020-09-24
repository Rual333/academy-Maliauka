package by.academy.homework.homework7;

import java.util.Random;

public class Consumer extends Thread {
	Port port;

	Consumer(Port port) {
		this.port = port;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (port) {
				if (port.getQuantityOfContainers() > Port.STORE_CAPACITY / 2 + 6) {
					port.getContainer();
					System.out
							.println("     Consumer get containers in the storage: " + port.getQuantityOfContainers());
					System.out.println(
							"     Containers in the storage after Consumer: " + port.getQuantityOfContainers());
				} else {
					Thread.yield();
				}
				try {
					sleep(new Random().nextInt(100));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
