package corejava;

import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
        String s1 = new String("rohan");
        Optional<String> checkNull = Optional.ofNullable(s1);

        if (checkNull.isPresent()) {
            System.out.println(checkNull.get());
        }else {
            System.out.println("object is empty");
        }

        // Using ifPresent
        checkNull.ifPresent(value -> System.out.println("Value is present: " + value));

        // Using orElse
        String result = checkNull.orElse("Default value");
        System.out.println("Result: " + result);

        // Using orElseGet
        result = checkNull.orElseGet(() -> "Generated default value");
        System.out.println("Result from orElseGet: " + result);

        // Using orElseThrow
        try {
            result = checkNull.orElseThrow(() -> new RuntimeException("No value present"));
            System.out.println("Result from orElseThrow: " + result);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
