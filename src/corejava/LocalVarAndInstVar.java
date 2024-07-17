package DeadlockExample;

class Person {
    //Instance variables
    public String name;
    public int age;

    //age and name are local variable.
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Age=" + this.age + " name=" + this.name);
    }
}

public class LocalVarAndInstVar {
    public static void main(String[] args) {
        Person p1 = new Person(24, "rohan");
        p1.display();
    }
}
