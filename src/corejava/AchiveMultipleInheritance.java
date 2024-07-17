package DeadlockExample;

interface A4 {
    public void display();
}

interface B4 {
    public void display();
}

class C4 implements A4,B4 {

    @Override
    public void display() {
        System.out.println("This is C4");
    }
}

public class AchiveMultipleInheritance {
    public static void main(String[] args) {
        C4 obj = new C4();
        obj.display();
    }
}
