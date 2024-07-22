package corejava;

class SharedResource1 {
    void method1(SharedResource1 otherResource) {
        synchronized (SharedResource1.class) {
            System.out.println(Thread.currentThread().getName() + " is executing method1()");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            otherResource.method2();
        }
    }

    void method2() {
        synchronized (SharedResource1.class) {
            System.out.println(Thread.currentThread().getName() + " is executing method2()");
        }
    }
}

class AvoidDeadLock {
    public static void main(String[] args) {
        SharedResource1 resource1 = new SharedResource1();
        SharedResource1 resource2 = new SharedResource1();

        // Thread 1
        Thread t1 = new Thread(() -> {
            resource1.method1(resource2);
        }, "Thread-1");

        // Thread 2
        Thread t2 = new Thread(() -> {
            resource2.method1(resource1);
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
