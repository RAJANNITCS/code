package ds_and_algo.recursion;

public class HeadRecursionExample {

    public static void fun(int num) {
        if (num > 0) {
            fun(num - 1);
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        HeadRecursionExample.fun(5);
    }
}
