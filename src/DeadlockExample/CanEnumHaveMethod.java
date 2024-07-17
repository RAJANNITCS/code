package corejava;

enum Operation {

    ADD {
        @Override
        public int apply(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT {
        @Override
        public int apply(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int x, int y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public int apply(int x, int y) {
            if (y != 0) {
                return x / y;
            } else {
                throw new ArithmeticException("Cannot divide by zero.");
            }
        }
    };

    // Abstract method that each enum constant must implement
    public abstract int apply(int x, int y);
}

public class CanEnumHaveMethod {
    public static void main(String[] args) {
        int resultAdd = Operation.ADD.apply(5, 3);
        int resultSubtract = Operation.SUBTRACT.apply(5, 3);
        int resultMultiply = Operation.MULTIPLY.apply(5, 3);
        int resultDivide = Operation.DIVIDE.apply(6, 2);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
    }
}
