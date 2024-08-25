package corejava;

public class FindFacorialNumberOfGiveNumber {
    public int findFactorialNumber(int value) {
        if (value == 0) {
            return 1;
        } else {
            return findFactorialNumber(value - 1) * value;
        }
    }

    public int findFactorialNumberV1(int value) {
        int sum = 1;
        for (int i = 1; i <= value; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        FindFacorialNumberOfGiveNumber obj = new FindFacorialNumberOfGiveNumber();
        System.out.println(obj.findFactorialNumber(5));
        System.out.println(obj.findFactorialNumberV1(5));
    }
}
