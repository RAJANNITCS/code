package corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    List<String> name = Arrays.asList("rohan","madhu","seema","sohan");

    public static void main(String[] args) {
        StreamApiExample obj = new StreamApiExample();

        List<Integer> newList = obj.list.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
        List<Integer> newList1 = obj.list.stream().map(element-> element * 2).collect(Collectors.toList());
//        newList.forEach(System.out::println);
//        newList1.forEach(System.out :: println);
        List<Integer> newList2 = obj.list.stream().filter(element-> element % 2==0).map(element ->element *2).collect(Collectors.toList());
        newList2.forEach(System.out :: println);

        List<String> nameList = obj.name.stream().filter(element-> element.startsWith("s")).collect(Collectors.toList());
        nameList.forEach(System.out :: println);
    }
}
