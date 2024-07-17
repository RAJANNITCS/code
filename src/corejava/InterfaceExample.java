package corejava;

interface Vehicle {
    void start();

    void stop();
}

class Bike3 implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Bike3 ktm = new Bike3();
        ktm.start();
        ktm.stop();
    }
}
