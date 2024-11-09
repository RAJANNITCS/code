package ds_and_algo.recursion;

public class NestedRecursionExample {

    public static int fun(int num) {
        if (num > 100)
            return num - 10;
        else
            return fun(fun(num + 11));
    }

    public static void main(String[] args) {
        System.out.println(NestedRecursionExample.fun(95));
    }
}
