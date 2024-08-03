//let us consider I have a list of numbers and you have to multiply each
// number by two do it?
package StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class MultipleEachNumberByTwo {
    public List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    public static void main(String[] args) {
        MultipleEachNumberByTwo obj = new MultipleEachNumberByTwo();
        List<Integer> newNumberList = obj.numberList.stream().map(element-> element * 2).collect(Collectors.toList());
        newNumberList.forEach(System.out :: println);
    }
}
