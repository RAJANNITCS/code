package Output;

public class FindOutputExample4 {

    public void method1 (Integer value) {
        value = value + 10;
    }

    public static void main(String[] args) {
        FindOutputExample4 obj = new FindOutputExample4();
        Integer value = 10;
        obj.method1(value);
        System.out.println(value);
    }
}
