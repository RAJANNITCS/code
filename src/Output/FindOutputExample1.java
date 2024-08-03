package Output;

class Base {
    public static void show() {
        System.out.println("Base class show method call");
    }
}

class Derived extends Base {
    public static void show() {
        System.out.println("Derived class show method call");
    }
}

public class FindOutputExample1 {
    public static void main(String[] args) {
        Derived d1 = new Derived();
        d1.show();
    }
}
