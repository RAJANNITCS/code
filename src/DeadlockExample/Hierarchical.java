package corejava;

class A2 {

    public void display() {
        System.out.println("This is class A2");
    }
}

class B2 extends A2{

    @Override
    public void display() {
        System.out.println("This is class B2");
    }
}

class C2 extends A2 {

    @Override
    public void display() {
        System.out.println("This is class C2");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        B2 obj1 = new B2();
        obj1.display();
        C2 obj2 = new C2();
        obj2.display();
    }
}
