package corejava;

import java.util.ArrayList;

public class IterableInterface {
    public ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        IterableInterface obj = new IterableInterface();
        obj.arr.add(1);
        obj.arr.add(2);
        obj.arr.add(3);
        obj.arr.add(4);
        obj.arr.add(5);

        for(Integer i1: obj.arr) {
            System.out.println(i1);
        }
    }
}
