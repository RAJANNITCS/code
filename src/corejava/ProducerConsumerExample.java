package corejava;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;

    public void produce(int item) throws InterruptedException {
        synchronized (buffer) {
            if (buffer.size() == capacity) {
                // Buffer is full, wait for a consumer to consume an item
                buffer.wait();
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            buffer.notifyAll(); // Notify all waiting consumers
        }
    }

    public int consume() throws InterruptedException {
        synchronized (buffer) {
            if (buffer.isEmpty()) {
                // Buffer is empty, wait for a producer to produce an item
                buffer.wait();
            }
            int item = buffer.poll();
            System.out.println("Consumed: " + item);
            buffer.notifyAll(); // Notify all waiting producers
            return item;
        }
    }
}

class Producer extends Thread{
    private final SharedBuffer buffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.buffer = sharedBuffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.produce(i);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread{
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producerThread = new Producer(buffer);
        Thread consumerThread = new Consumer(buffer);

        producerThread.start();
        consumerThread.start();
    }
}
