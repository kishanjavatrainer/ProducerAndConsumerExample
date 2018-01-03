package org.infotech.com;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerAndConsumerTest {

	public static void main(String[] args) {

		Queue<Integer> sharedQueue = new LinkedList<>();
		
		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		consumerThread.start();
	}

}
