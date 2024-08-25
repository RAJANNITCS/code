package models;

public class Employee {
    private Integer age;
    private String name;
    private Double salary;
    private String department;
    private String code;

    public Employee(Integer age, String name, Double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Employee(Integer age,String name,Double salary,String department) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Employee(String code,String name,String departement,Integer age) {
        this.code = code;
        this.name = name;
        this.department = departement;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
