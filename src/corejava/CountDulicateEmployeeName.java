//Write a code to print duplicate employee name count from employee list ?
//        - ('E40001','PRADEEP','H.R',36),
//        - ('E40002','ASHOK','MANAGER',28),
//        - ('E40003','PRADEEP','ASST MANAGER',28),
//        - ('E40005','ASHOK','GENERAL MANAGER',26);
//
package corejava;

import java.util.List;
import java.util.ArrayList;
import models.Employee;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class CountDulicateEmployeeName {
    List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        CountDulicateEmployeeName obj = new CountDulicateEmployeeName();
        obj.employeeList.add(new Employee("E40001","PRADEEP","H.R",36));
        obj.employeeList.add(new Employee("E40002","ASHOK","MANAGER",28));
        obj.employeeList.add(new Employee("E40003","PRADEEP","ASST MANAGER",28));
        obj.employeeList.add(new Employee("E40005","ASHOK","GENERAL MANAGER",26));
        obj.employeeList.add(new Employee("E40005","SEEMA","GENERAL MANAGER",26));


        // my code
        Map<String,Integer> employeeMap = new HashMap<>();

        obj.employeeList.forEach(employee -> {
            employeeMap.put(employee.getName(),employeeMap.containsKey(employee.getName()) ?
                    employeeMap.get(employee.getName()) + 1 : 1);
        });

        System.out.println(employeeMap);

        // inhance code
        Map<String, Long> employeeCountMap = obj.employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        employeeCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " appears " + entry.getValue() + " times."));

    }
}
