package DeadlockExample;

public class CreateThreadUsingRunnableInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("Run thread");
    }

    public static void main(String[] args) {
        CreateThreadUsingRunnableInterface obj = new CreateThreadUsingRunnableInterface();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
