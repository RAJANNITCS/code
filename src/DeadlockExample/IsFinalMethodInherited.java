package corejava;

class Person5 {

    public final void display() {
        System.out.println("person class method");
    }
}

class Student2 extends Person5 {

    // This would result in a compilation error:
    // public void display() {
    //     System.out.println("Trying to override.");
    // }
}


public class IsFinalMethodInherited {
    public static void main(String[] ages) {
        Student2 obj_1 = new Student2();
        obj_1.display();
    }
}
