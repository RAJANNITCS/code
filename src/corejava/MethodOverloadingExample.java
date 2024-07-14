package corejava;

class SumOfNumber {

    public static Integer addNumber(Integer num1,Integer num2) {
        return (num1 + num2);
    }

    public static Integer addNumber(Integer num1,Integer num2,Integer num3) {
        return (num1 + num2 + num3);
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        System.out.println(SumOfNumber.addNumber(22,33));
        System.out.println(SumOfNumber.addNumber(22,33,44));
    }
}
