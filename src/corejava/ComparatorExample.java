package corejava;

import models.Employee;
import java.util.*;
import java.util.Comparator;

class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortBySalary implements  Comparator<Employee> {

    @Override
    public int compare(Employee obj1, Employee obj2) {
        return Double.compare(obj1.getSalary(),obj2.getSalary());
    }
}

class SortByAge implements Comparator<Employee> {

    @Override
    public int compare(Employee obj1, Employee obj2) {
        return Integer.compare(obj1.getAge(),obj2.getAge());
    }
}

public class ComparatorExample {
    List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        ComparatorExample obj = new ComparatorExample();
        obj.employees.add(new Employee(33,"aman",4300000.00));
        obj.employees.add(new Employee(22,"madhu",200000.00));
        obj.employees.add(new Employee(23,"rajan",2300000.00));

//        Collections.sort(obj.employees,new SortByAge());
        Collections.sort(obj.employees,new SortByName());
        obj.employees.forEach(System.out :: println);
    }
}
