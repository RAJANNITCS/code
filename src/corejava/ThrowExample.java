package DeadlockExample;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            validateAge(15);
        }catch (Exception e) {
            System.out.println("Caught an exception : "+e.getMessage());
        }
    }

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        }else {
            System.out.println("valid age");
        }
    }
}
