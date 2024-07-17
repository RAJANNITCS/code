package DeadlockExample;

class Person7 {
    public Integer age;
    public String name;

    public Person7(Integer age ,String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println(this.age+" "+this.name);
    }
}

public class ThisKeywordsExample {
    public static void main (String[] ages) {
        Person7 p1 = new Person7(22,"rohan");
        p1.display();
    }
}
