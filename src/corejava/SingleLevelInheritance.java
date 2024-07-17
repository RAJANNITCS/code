package corejava;

class A {

    public void display() {
        System.out.println("This is class A");
    }
}

class B extends A {

    @Override
    public void display() {
        System.out.println("This is class B");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
