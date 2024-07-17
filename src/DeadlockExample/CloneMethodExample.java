package corejava;

class Student1 implements Cloneable{
    public String name;
    public Integer age;

    public Student1(Integer age,String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println(this.age+" "+this.name);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


public class CloneMethodExample {
    public static void main(String[] ages) {
        Student1 s1 = new Student1(22,"rohan");
        try {
            Student1 s2 = (Student1) s1.clone();
            s2.age = 35;
            s2.display();
        }catch (Exception e) {
            e.printStackTrace();
        }
        s1.display();

    }
}
