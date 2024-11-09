package ds_and_algo.recursion;

class SumOfnNaturalNumbar {

    public static int sum = 0;

    public static int fun(int num) {
        if (num > 0) {
            SumOfnNaturalNumbar.sum++;
            return fun(num - 1) + SumOfnNaturalNumbar.sum;
        }
        return 0;
    }
}

public class StaticVariariableInRecursion {
    public static void main(String[] args) {
        System.out.println(SumOfnNaturalNumbar.fun(5));
    }
}
