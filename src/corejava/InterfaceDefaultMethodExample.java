package DeadlockExample;

interface I1  {

    public default void display() {
        System.out.println("This is interface I1");
    }

}

interface I2 {

    public default void display() {
        System.out.println("This is interface I2");
    }

}

class Merge implements I1,I2 {

    @Override
    public void display() {
        I1.super.display();
    }
}

public class InterfaceDefaultMethodExample {
    public static void main(String[] args) {
        Merge obj = new Merge();
        obj.display();
    }
}
