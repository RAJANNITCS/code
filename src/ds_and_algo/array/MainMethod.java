package ds_and_algo.array;

public class MainMethod {

    public static void main(String[] args) {
        ArrayADT arr = new ArrayADT(10);
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr.displayV1();
//        System.out.println("After Insert Operation Perform:");
//        arr.insert(4,12);
//        System.out.println("After Delete Operation Perform");
//        System.out.println("Delete value is = "+arr.delete(4));
        System.out.println("Search value positions = "+arr.search(8));
        arr.displayV1();
    }

}
