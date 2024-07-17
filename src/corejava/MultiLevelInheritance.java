package DeadlockExample;

class A1 {
    public void display() {
        System.out.println("This is class A1");
    }
}

class B1 extends A1 {

    @Override
    public void display() {
        System.out.println("This is class B1");
    }
}

class C1 extends B1 {

    @Override
    public void display() {
        System.out.println("This is class C1");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.display();
    }
}
