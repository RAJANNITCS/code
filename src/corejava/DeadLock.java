package corejava;

class SharedResource {
    synchronized void method1(SharedResource otherResource) {
        System.out.println(Thread.currentThread().getName() + " is executing method1()");
        // Simulating some work
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Trying to call method2() on the other resource
        otherResource.method2();
    }

    synchronized void method2() {
        System.out.println(Thread.currentThread().getName() + " is executing method2()");
    }
}

class DeadlockExample {
    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();

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
