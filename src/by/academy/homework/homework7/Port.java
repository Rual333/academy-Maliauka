/*Написать клиент для работы порта. 
Корабли могут заходить в порт для разгрузки / загрузки контейнеров. 
Количество контейнеров, находятся в текущий момент в порту и на корабле, 
должно быть неотъемлемой и не превышать заданную грузоподъемность судна и емкость порта. 
В порту работает несколько причалов. В одном причале может стоять только один корабль. 
Корабль может загружаться у причала, разгружаться или выполнять оба действия.*/

package by.academy.homework.homework7;

import java.util.concurrent.atomic.AtomicInteger;

public class Port {

	static final int NUMBER_OF_PIERS = 5;
	static final int STORE_CAPACITY = 40;
	static boolean[] AVAILABLE_PIERSES = new boolean[NUMBER_OF_PIERS];
	private AtomicInteger quantityOfContainers = new AtomicInteger();

	public Port(int quantityOfContainers) {
		super();
		this.quantityOfContainers.set(quantityOfContainers);
	}

	public void getContainer() {
		quantityOfContainers.decrementAndGet();
	}

	public void putContainer() {
		quantityOfContainers.incrementAndGet();
	}

	public int getQuantityOfContainers() {
		return quantityOfContainers.get();
	}

}
