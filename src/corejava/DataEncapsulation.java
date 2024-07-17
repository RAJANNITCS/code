package DeadlockExample;

class Person8 {
    private Integer age;
    private String name;

    public Person8(Integer age,String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(Integer age) {this.age = age;}
    public void setName(String name) {this.name = name;}

    public Integer getAge() {return this.age;}
    public String getName() {return this.name;}

    public void display() {
        System.out.println(this.age+" "+this.name);
    }
}


public class DataEncapsulation {
    public static void main(String[] ages) {
        Person8 obj = new Person8(22,"rohan");
        obj.display();
        obj.setAge(35);
        obj.display();
    }
}
