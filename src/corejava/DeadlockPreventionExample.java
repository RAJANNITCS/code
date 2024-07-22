package corejava;

class SharedResource2 {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    void method1() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " acquired lock1 in method1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " acquired lock2 in method1");
                // Critical section protected by both lock1 and lock2
            }
        }
    }

    void method2() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " acquired lock1 in method2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " acquired lock2 in method2");
                // Critical section protected by both lock1 and lock2
            }
        }
    }
}

class DeadlockPreventionExample {
    public static void main(String[] args) {
        SharedResource2 resource = new SharedResource2();

        // Thread 1
        Thread t1 = new Thread(resource::method1, "Thread-1");

        // Thread 2
        Thread t2 = new Thread(resource::method2, "Thread-2");

        t1.start();
        t2.start();
    }
}

