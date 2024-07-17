package corejava;

abstract class Car {
    // Abstract method (does not have a body)
    abstract void accelerate();

    // Regular method
    void applyBrakes() {
        System.out.println("Brakes applied");
    }
}

class Sedan extends Car {
    @Override
    void accelerate() {
        System.out.println("Sedan is accelerating");
    }
}


public class AbstractClassEmample {
    public static void main(String[] args) {
        Sedan obj = new Sedan();
        obj.accelerate();
        obj.applyBrakes();
    }
}
