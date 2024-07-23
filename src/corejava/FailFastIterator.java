package corejava;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {
    public ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        FailFastIterator obj = new FailFastIterator();
        obj.arr.add(1);
        obj.arr.add(2);
        obj.arr.add(3);
        obj.arr.add(4);
        obj.arr.add(5);

        Iterator<Integer> iteratorObj = obj.arr.iterator();
        while(iteratorObj.hasNext()) {
            System.out.println(iteratorObj.next());
            obj.arr.add(6);
        }
    }
}
