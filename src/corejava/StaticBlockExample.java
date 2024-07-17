package DeadlockExample;

public class StaticBlockExample {
    public static Integer employeeAge;

    static {
        StaticBlockExample.employeeAge = 25;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlockExample.employeeAge);
    }
}
