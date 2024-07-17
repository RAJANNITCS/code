package corejava;

class Person1 {
    public Integer age;
    public String name;

    public Person1(Integer age,String name) {
        this.age = age;
        this.name = name;
    }

    public void displayPerson() {
        System.out.println("Age "+ this.age +" "+"name "+this.name);
    }
}

public class ReferenceVariable {
    public static void main(String[] age) {
        Person1 p1 = new Person1(22,"rohan");
        p1.displayPerson();
        Person1 p2 = p1;
        p1.age = 25;
        p1.name = "mohan";
        p2.displayPerson();
        p1.displayPerson();
    }
}
