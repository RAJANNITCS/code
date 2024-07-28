package corejava;


import java.util.function.Function;

interface dFunctions<T,R> {

    public R dApple(T value);
}

public class FuncationsExample {
    public static void main(String[] args) {
        Function<String,Integer> f1 = (value) -> (value.length());
        System.out.println(f1.apply("Hello"));
        dFunctions<String,Integer> f2 = (value) -> (value.length());
        System.out.println(f2.dApple("Hello World !!"));
    }
}
