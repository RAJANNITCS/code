package corejava;

import java.util.ArrayList;

public class ConvertArrayListToArray {
    public ArrayList<String> arr = new ArrayList<>();
    public ArrayList<Integer> intArr = new ArrayList<>();

    public static void main(String[] args) {
        ConvertArrayListToArray obj = new ConvertArrayListToArray();
        obj.arr.add("One");
        obj.arr.add("Two");
        obj.arr.add("Three");
        obj.arr.add("Foure");
        obj.arr.add("Five");

        obj.intArr.add(1);
        obj.intArr.add(2);
        obj.intArr.add(3);
        obj.intArr.add(4);
        obj.intArr.add(5);

        String[] stringArr = obj.arr.toArray(new String[0]);
        Integer[] intArr1 = obj.intArr.toArray(new Integer[0]);
        for (String s1 : stringArr) {
            System.out.println(s1);
        }

        for (Integer i1 : intArr1) {
            System.out.println(i1);
        }
    }
}
