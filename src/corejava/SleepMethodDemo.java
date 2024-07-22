package corejava;

public class SleepMethodDemo extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Hello ="+i);
                Thread.sleep(1000);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SleepMethodDemo obj = new SleepMethodDemo();
        obj.start();
    }
}
