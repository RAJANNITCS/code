package models;

public class Person implements Cloneable {
    public Integer age;
    public String name;

    public Person(Integer age,String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Name = "+this.name+" "+"Age= "+this.age);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
