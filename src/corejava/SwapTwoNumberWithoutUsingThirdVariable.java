package corejava;

public class SwapTwoNumberWithoutUsingThirdVariable {
    public static void main(String[] args) {
        Integer num1 = 50;
        Integer num2 = 70;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Number 1="+ num1);
        System.out.println("Number 2="+ num2);
    }
}
