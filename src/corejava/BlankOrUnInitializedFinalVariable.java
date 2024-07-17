package DeadlockExample;

class Person6 {
    public final String personPanNumber;

    public Person6(String personPan) {
        this.personPanNumber = personPan;
    }

    public void display() {
        System.out.println(this.personPanNumber);
    }
}

public class BlankOrUnInitializedFinalVariable {
    public static void main(String[] ages) {
        Person6 obj1 = new Person6("JPCPS2372D");
        obj1.display();
    }
}
