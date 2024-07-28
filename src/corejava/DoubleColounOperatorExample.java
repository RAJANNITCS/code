package corejava;

//
interface Deatils {
    public void display(String value);
}

interface SumOfNumber1 {
    public Integer twoNumberSum(Integer num1,Integer num2);
}


class Employee1 {
    public Integer age;
    public String name;

    public Employee1(Integer age,String name) {
        this.age = age;
        this.name = name;
    }
}

interface EmployeeFactory {
    public Employee1 getEmployee(Integer age,String name);
}

class EmployeeFactoryImp implements  EmployeeFactory {

    @Override
    public Employee1 getEmployee(Integer age,String name) {
        Employee1 e1 = new Employee1(age,name);
        return e1;
    }
}


public class DoubleColounOperatorExample {

    public static void display(String value) {
        System.out.println(value);
    }

    public Integer twoNumberSum(Integer num1, Integer num2) {
        return (num1 + num2);
    }


    public static void main(String[] args) {

        // static method reference using lambda exprection
        Deatils d1 = (s1)-> {
            System.out.println(s1);
        };

        // static method reference using double coloun operation
        // if the method is static method.
        Deatils d2 = (DoubleColounOperatorExample :: display);

        d2.display("Hello world");

        // create obj of DoubleColounOperator class
        DoubleColounOperatorExample obj = new DoubleColounOperatorExample();

        // create twoSumMethod using lembda expration
        SumOfNumber1 s1 = (num1,num2) -> {
            return (num1 + num2);
        };

        System.out.println(s1.twoNumberSum(22,33));

        // create reference if the method is reference method
        SumOfNumber1 s2 = (obj::twoNumberSum);
        System.out.println(s2.twoNumberSum(22,33));

        // create normal obj and use
        EmployeeFactoryImp e1 = new EmployeeFactoryImp();
        e1.getEmployee(22,"rohan");

        // by using lambda expration
        EmployeeFactory e2 = (age,name)-> {
            return new Employee1(age,name);
        };

        e2.getEmployee(33,"rohan");

        // create constructors reference using double coloun opereator
        EmployeeFactory obj1 = (Employee1 :: new);
        Employee1 e3 = obj1.getEmployee(33,"rohan");
        System.out.println(e3.name);

    }
}
