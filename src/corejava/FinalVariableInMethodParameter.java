package corejava;

class SumOfTwoNumber {

    public static Integer sumOfTwoNumber(final Integer numb1,final Integer numb2) {
        if (numb1 != null && numb2 != null) {
            return (numb1 + numb2);
        }
        return 0;
    }

}

public class FinalVariableInMethodParameter {
    public static void main(String[] ages) {
        System.out.println(SumOfTwoNumber.sumOfTwoNumber(2,4));
    }
}
