package corejava;

import models.Student;
import java.util.*;

public class ComparableExample {
    List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        ComparableExample obj = new ComparableExample();
        obj.students.add(new Student("rohan",22,16));
        obj.students.add(new Student("ravi",12,13));
        obj.students.add(new Student("madhu",21,33));

        Collections.sort(obj.students);
        obj.students.forEach(System.out :: println);
    }
}
