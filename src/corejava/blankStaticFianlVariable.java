package corejava;

class Bike {
    public static final Integer topSpeed;

    static {
        topSpeed = 150;
    }

    public void display() {
        System.out.println(Bike.topSpeed);
    }
}

public class blankStaticFianlVariable {
    public static void main(String[] ages) {
        Bike b1 = new Bike();
        b1.display();
    }
}
