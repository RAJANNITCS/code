package ds_and_algo.recursion;

public class IndirectRecursionExample {

    public static void funA(int num) {
        if (num > 0) {
            System.out.println(num);
            IndirectRecursionExample.funB(num - 1);
        }
    }

    public static void funB(int num) {
        if (num > 1) {
            System.out.println(num);
            IndirectRecursionExample.funA(num/2);
        }
    }

    public static void main(String[] args) {
        IndirectRecursionExample.funA(20);
    }
}
