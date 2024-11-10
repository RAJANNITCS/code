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
//        System.out.println("Search value positions = "+arr.search(8));
//        System.out.println("After Perform Get operation !!");
//        System.out.println("Get value is = "+ arr.get(9));
//        System.out.println("After Perform set operation !!");
//        arr.set(4,12);
//        System.out.println("Min value of Array =" + arr.min());
//        System.out.println("Max value of Array = "+ arr.max());
//        System.out.println("sum of Array element = "+arr.sum());
//        System.out.println("Avg of Array element = "+arr.avg());
//        System.out.println("After perform left Shift operation :");
//        arr.leftShift();
//        System.out.println("After perform ")
//        System.out.println("After perform left rotation :");
//        arr.leftRotate();
//        System.out.println("After perform right shift :");
//        arr.rightShift();
//        System.out.println("After perform right rotation :");
//        arr.rightRotation();
        System.out.println("After perform reverse :");
//        arr.reverseV1();
        arr.reverseV2();
//        arr.displayV1();
        arr.displayV2();
    }

}
