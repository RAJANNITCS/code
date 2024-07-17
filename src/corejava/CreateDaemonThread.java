package DeadlockExample;

public class CreateDaemonThread extends Thread {

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("This is daemon thread");
        }else {
            System.out.println("This is normal thread");
        }
    }

    public static void main(String[] args) {
        CreateDaemonThread d1 = new CreateDaemonThread();
        CreateDaemonThread d2 = new CreateDaemonThread();
        d1.setDaemon(true);
        d1.start();
        d2.start();
        d2.start();
    }
}
