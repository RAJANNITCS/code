    package corejava;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.HashSet;
    import java.util.Iterator;

    public class IteratorExample {
        public ArrayList<String> arr = new ArrayList<>();

        public HashSet<Integer> hashSet = new HashSet<>();
        public HashMap<Integer,String> hashMap = new HashMap<>();

        public static void main(String[] args) {
            IteratorExample obj = new IteratorExample();
            obj.arr.add("One");
            obj.arr.add("Two");
            obj.arr.add("Three");
            obj.arr.add("Foure");
            obj.arr.add("Five");

            Iterator<String> iteratorObj = obj.arr.iterator();

            while(iteratorObj.hasNext()) {
                System.out.println(iteratorObj.next());
            }
        }
    }
