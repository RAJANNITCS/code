package DeadlockExample;

import models.Person;

public class CloneableInterfaceExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person obj1 = new Person(22,"rohan");
        obj1.display();
        Person obj2 = (Person) obj1.clone();
        obj2.name = "ram";
        obj2.display();
        obj1.display();
    }
}
