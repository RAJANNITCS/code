package DeadlockExample;

class Person10 {
    public Integer age;
    public String name;

    public Person10(Integer age,String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Name = "+this.name+" "+"age ="+this.age);
    }
}

class Student3 extends Person10 {
    public Integer rollNo;

    public Student3(Integer age,String name,Integer rollNo) {
        super(age,name);
        this.rollNo = rollNo;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("roll No = "+this.rollNo);
    }
}

public class ConstructorChaning {
    public static void main(String[] args) {
        Student3 obj = new Student3(22,"rohan",16);
        obj.display();
    }
}
