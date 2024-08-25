//How do you find duplicate elements in a list using Stream API in java?
//Input : [1,2,3,4,2,5,4]
//Output : [2,4]
//If you use filter and why?
//And the another question is remove duplicate element from array using stream api?

package corejava;
import java.util.*;
import java.util.stream.Collectors;

public class CountDupicateElementAndRemoveDulicate {
    public List<Integer> list = Arrays.asList(1,2,3,4,2,5,4);

    public static void main(String[] args) {
        CountDupicateElementAndRemoveDulicate obj = new CountDupicateElementAndRemoveDulicate();

        // if we want to remove duplicate element from list
        List<Integer> removeDuplicate = obj.list.stream().distinct().collect(Collectors.toList());

        System.out.println("remove duplicate="+removeDuplicate);

        //if we want to remove duplicate element from list v2
        Set<Integer> tempSet = obj.list.stream().collect(Collectors.toSet());
        System.out.println("remove duplicate="+tempSet);

        // print duplicate elements
        Map<Integer, Integer> tempMap1 = new HashMap<>();
        obj.list.forEach(element -> {
            tempMap1.put(element,tempMap1.containsKey(element)? tempMap1.get(element) + 1: 1);
        });

        List<Integer> newList = new ArrayList<>();
        Iterator<Integer> iteratorObj = tempMap1.keySet().iterator();

        while (iteratorObj.hasNext()) {
            Integer key = iteratorObj.next();
            if (tempMap1.get(key) >= 2) {
                newList.add(key);
            }
        }

        System.out.println("Recommend output ="+newList);

        //print dulicate element
        Map<Integer,Long> tempMap2 = obj.list.stream().collect(Collectors.groupingBy(element -> element,Collectors.counting()));
        List<Integer> newList1 = tempMap2.entrySet().stream().filter(entity -> entity.getValue() > 1).map(Map.Entry :: getKey).collect(Collectors.toList());
        System.out.println("Recommend output 2"+newList1);

    }
}
