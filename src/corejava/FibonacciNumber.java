package corejava;

public class FibonacciNumber {

//   find fibonacci number in iterative way
    public static Integer findFibonacciNumber(Integer num) {
        Integer fibonacciNumber = 0;
        Integer firstNumber = 0;
        Integer secondNumber = 1;

        int i = 1;
        do{
            fibonacciNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonacciNumber;
            i++;
        }while(i < num);

        return fibonacciNumber;
    }

    public static void main(String[] args) {
        System.out.println(FibonacciNumber.findFibonacciNumber(6));
    }
}
