package ds_and_algo.recursion;

public class TailRecursionExample {

    public static void fun(int num) {
        if (num > 0) {
            System.out.println(num);
            fun(num - 1);
        }
    }

    public static void main(String[] args) {
        TailRecursionExample.fun(5);
    }
}
