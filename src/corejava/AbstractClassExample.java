package corejava;

abstract class Vehicle1 {
    public static Integer speed = 0;

    public abstract void start();

    public void increaseSpeed(Integer speed) {
        Vehicle1.speed += speed;
    }

    public static void displaySpeed() {
        System.out.println("Speed = "+Vehicle1.speed);
    }

    public abstract void stop();

}

class Bike5 extends Vehicle1 {

    public void start() {
        System.out.println("Start bike");
    }

    public void stop() {
        if (Vehicle1.speed > 0) {
            Vehicle1.speed = 0;
        }
        System.out.println("Stop speed");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Bike5 ktm = new Bike5();
        ktm.start();
        ktm.increaseSpeed(10);
        Vehicle1.displaySpeed();
        ktm.stop();
    }
}
