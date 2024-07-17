package corejava;

class SuperClass {
    // Superclass method throws NullPointerException (unchecked exception)
    void myMethod() throws NullPointerException {
        // Some code that may result in a NullPointerException
        throw new NullPointerException("SuperClass NullPointerException");
    }
}

class SubClass extends SuperClass {
    // Overriding method throws a different runtime exception (unchecked exception)
    @Override
    void myMethod() throws RuntimeException {
        // Some code in the subclass
        System.out.println("SubClass's myMethod is called");

        // It can throw a different runtime exception
        throw new IllegalArgumentException("SubClass IllegalArgumentException");
    }
}

public class KeepSameException {
    public static void main(String[] args) {
        SuperClass superClassInstance = new SubClass();

        try {
            superClassInstance.myMethod();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
