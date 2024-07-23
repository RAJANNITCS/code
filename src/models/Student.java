package models;

public class Student implements Comparable<Student>{
    private Integer rollNo;
    private String name;
    private Integer age;

    public Student(String name, Integer age, Integer rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student obj) {
        // Ascending order
//        return Integer.compare(this.rollNo,obj.getRollNo());

        // you can write like this. (Integer.compare() use this)
//        if (this.getRollNo().equals(obj.getRollNo())) {
//            return 0;
//        }else if (this.getRollNo() < obj.getRollNo()) {
//            return 1;
//        }else {
//            return -1;
//        }
        // for string
        return this.getName().compareTo(obj.getName());
    }
}
