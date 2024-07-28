package corejava;

@FunctionalInterface
interface Display {
    public void display(String s1);
}

@FunctionalInterface
interface MathOperation {
    public Integer mathOperation(Integer num1, Integer num2);
}

public class LambdaExpration {
    public static void main(String[] args) {
        Display d1 = (s1) -> {
            System.out.println(s1);
        };

        d1.display("Hello World !!");

        MathOperation sumOfTwoNumber = (num1,num2) -> {
            return (num1 + num2);
        };

        System.out.println(sumOfTwoNumber.mathOperation(22,33));
    }
}
