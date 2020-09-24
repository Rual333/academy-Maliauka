package by.academy.homework.homework7;

import java.util.Random;

public class Producer extends Thread {

	Port port;

	Producer(Port port) {
		this.port = port;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (port) {
				if (port.getQuantityOfContainers() < Port.STORE_CAPACITY / 2 - 6) {
					port.putContainer();
					System.out.println("  Producer put containers in the storage: " + port.getQuantityOfContainers());
					System.out.println("  Containers in the storage after Producer: " + port.getQuantityOfContainers());
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
