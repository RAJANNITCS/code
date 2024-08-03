//Can you write a program on the Stream API to filter employees working in the
// sales department with a salary above 50,000
package StreamApi;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployee {
    public List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        FilterEmployee obj = new FilterEmployee();
        obj.employeeList.add(new Employee(22,"rohan",230000.0,"HR"));
        obj.employeeList.add(new Employee(22,"ram",330000.0,"SALES"));
        obj.employeeList.add(new Employee(22,"sohan",540000.0,"IT"));
        obj.employeeList.add(new Employee(22,"madhu",510000.0,"SALES"));
        obj.employeeList.add(new Employee(22,"seema",600000.0,"SALES"));
        obj.employeeList.add(new Employee(22,"kiran",310000.0,"HR"));

//        List<Employee> newEmployeeList = obj.employeeList.stream().filter(employee ->
//                (employee.getSalary() > 500000.00 && employee.getDepartment().equals("SALES"))).collect(Collectors.toList());
//        newEmployeeList.forEach(System.out :: println);

        Employee employee1 = obj.employeeList.stream().max((e1,e2)-> Double.compare(e1.getSalary(), e2.getSalary())).get();
        System.out.println(employee1);
    }
}
