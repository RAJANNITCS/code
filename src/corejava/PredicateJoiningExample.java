package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoiningExample {
    public static void display(Predicate<Integer> p1, List<Integer> list) {
        for (Integer i1: list) {
            if (p1.test(i1)) {
                System.out.println(i1);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(0,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        // Predicate to check if a number is greater than 10
        Predicate<Integer> p1 = (value) -> value > 10;
        // Predicate to check if a number is even
        Predicate<Integer> p2 = (value) -> value % 2 == 0;

        // Combining predicates using and()
        Predicate<Integer> pAnd = p1.and(p2);
        System.out.println("Numbers greater than 10 AND even:");
        display(pAnd, list);

        // Combining predicates using or()
        Predicate<Integer> pOr = p1.or(p2);
        System.out.println("Numbers greater than 10 OR even:");
        display(pOr, list);

        // Using negate() to create a predicate that checks for numbers NOT greater than 10
        Predicate<Integer> pNegate = p1.negate();
        System.out.println("Numbers NOT greater than 10:");
        display(pNegate, list);
    }
}
