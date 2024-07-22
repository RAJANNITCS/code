package corejava;

class BookTicketEarning extends Thread {
    public int totalEarning = 0;

    @Override
    public void run() {
        synchronized (this) {
            for(int i = 0; i < 10; i++) {
                this.totalEarning += 100;
            }
            this.notify();
        }
    }
}

public class WaitAndNotifyAndNotifyAllDemo {
    public static void main(String[] args) {
        BookTicketEarning obj = new BookTicketEarning();
        obj.start();
        synchronized (obj) {
            try {
              obj.wait();
              System.out.println(obj.totalEarning);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
