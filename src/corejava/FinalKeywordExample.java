package DeadlockExample;

class Person4 {

    public void display() {
        System.out.println("print person 2");
    }
}

class Student extends Person4 {

    @Override
    public void display() {
        System.out.println("display student class");
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        Person4 p1 = new Person4();
        p1.display();
        final Integer age = 25;
//        age = 35;
        System.out.println(age);
    }
}
