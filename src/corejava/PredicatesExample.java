package corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

interface dPredicate<T> {
    public boolean dtest(T value);
}

public class PredicatesExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (value)-> value > 10;
        Predicate<String> s1 = (value)-> value.length() > 10;
        dPredicate<Integer> p2 = (value)-> value > 10;
        Predicate<List<String>> p3 = (value) -> value.isEmpty();
        dPredicate<List<String>> p4 = (value) -> value.isEmpty();
        System.out.println(p1.test(10));
        System.out.println(p2.dtest(20));
        System.out.println(s1.test("Hello"));
        System.out.println(p3.test(new ArrayList<>()));
        System.out.println(p4.dtest(new ArrayList<>()));
    }
}
