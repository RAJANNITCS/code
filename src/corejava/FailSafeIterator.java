package corejava;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {
    public ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        FailSafeIterator obj = new FailSafeIterator();
        obj.concurrentHashMap.put(1,"A");
        obj.concurrentHashMap.put(2,"B");
        obj.concurrentHashMap.put(3,"C");
        obj.concurrentHashMap.put(4,"D");
        obj.concurrentHashMap.put(5,"E");

        Iterator<Integer> iteratorObj = obj.concurrentHashMap.keySet().iterator();

        while (iteratorObj.hasNext()) {
            System.out.println(iteratorObj.next());
            obj.concurrentHashMap.remove(3);
        }
    }
}
