package corejava;

class Person11 implements Cloneable {
    public Integer age;
    public String name;

    public Person11(Integer age,String name) {
        this.age = age;
        this.name = name;
    }

    public Person11(Person11 p1) {
        this.age = p1.age;
        this.name = p1.name;
    }

    public void display() {
       System.out.println("Name = "+this.name+" "+"Age = "+this.age);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

public class CopyConstructor {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person11 p1 = new Person11(28,"rohan");
        p1.display();
        Person11 p2 = new Person11(p1);
        p2.display();
        p2.name = "ravi";
        Person11 p3 = (Person11) p2.clone();
        p3.display();
    }
}
