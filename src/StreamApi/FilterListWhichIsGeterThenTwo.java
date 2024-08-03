// I want to filter the list where the number is greater than two?
//can you try to sort the list based on ascending and descending order?
//find the minimum number from this list and maximum number from this list?
//can you tell me how to find the total number of elements into this list?
package StreamApi;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FilterListWhichIsGeterThenTwo {
    public List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8);
    public List<Integer> unsortList = Arrays.asList(5,6,3,4,2,4,6,2,2);

    public static void main(String[] args) {
        FilterListWhichIsGeterThenTwo obj = new FilterListWhichIsGeterThenTwo();
        List<Integer> newList =  obj.numberList.stream().filter(element -> element > 2).collect(Collectors.toList());
//        System.out.println(newList);
        List<Integer> sortedListAscending = obj.unsortList.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedListAscending);

        List<Integer> sortedListDescending = obj.unsortList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedListDescending);

        Integer min = obj.numberList.stream().min(Integer::compareTo).get();
        Integer max = obj.numberList.stream().max(Integer::compareTo).get();
        long total = obj.numberList.stream().count();

        System.out.println("min="+ min);
        System.out.println("max="+ max);
        System.out.println("total="+ total);
    }
}
