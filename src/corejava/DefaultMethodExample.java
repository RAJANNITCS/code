package DeadlockExample;

import java.util.ArrayList;
import java.util.List;

public class DefaultMethodExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Charlie");
        list.add("Bravo");
        list.add("Alpha");

        // Using the default sort method in the List interface
        list.sort(String::compareTo);

        System.out.println(list);  // Output: [Alpha, Bravo, Charlie]
    }
}
