package DeadlockExample;


public class StaticVariableExample {
    public static Integer count = 0;

    public static void main(String[] args) {
        StaticVariableExample s1 = new StaticVariableExample();
        StaticVariableExample s2 = new StaticVariableExample();
        s1.count++;
        s2.count++;

        System.out.println(StaticVariableExample.count);
    }
}
