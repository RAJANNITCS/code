package DeadlockExample;

class Person12 {

    public void display() {
        System.out.println("This is person class");
    }
}

class Student4 extends Person12 {

    @Override
    public void display() {
        System.out.println("This is student class");
    }
}

public class MethodOverrideing {
    public static void main(String[] args) {
        Student4 obj = new Student4();
        obj.display();
    }
}
