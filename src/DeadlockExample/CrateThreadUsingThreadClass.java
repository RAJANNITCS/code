package corejava;

public class CrateThreadUsingThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println("Run thread");
    }

    public static void main(String[] args) {
        CrateThreadUsingThreadClass t1 = new CrateThreadUsingThreadClass();
        t1.start();
    }
}
