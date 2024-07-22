package corejava;

public class JoinMethodExample extends Thread {
    static Thread mainThread;

    @Override
    public void run() {
        try {
//            mainThread.join();
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        mainThread = Thread.currentThread();
        JoinMethodExample obj = new JoinMethodExample();
        obj.start();
        try {
            obj.join();
            for(int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "1");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
