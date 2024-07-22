package corejava;

class SharedResource3 {
    private volatile boolean flag = false;

    public void setFlag() {
        flag = true;
    }

    public void printMessage() {
        while (!flag) {
            System.out.println("Hello");
        }
        System.out.println("flag is now true. Exiting loop.");
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedResource3 sharedResource = new SharedResource3();

        // Thread 1: Setting the flag to true
        Thread thread1 = new Thread(() -> {
            sharedResource.setFlag();
        });

        // Thread 2: Printing a message when the flag becomes true
        Thread thread2 = new Thread(() -> {
            sharedResource.printMessage();
        });

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

