package corejava;

class OuterClass {
    // Static field in the outer class
    private static String outerStaticField = "Outer static field";

    // Non-static field in the outer class
    private String outerInstanceField = "Outer instance field";

    // Static nested class
    public static class StaticNestedClass {
        public void printMessage() {
            // Accessing static member of the outer class
            System.out.println("Accessing: " + outerStaticField);

            // Cannot access non-static members of the outer class directly
            // Uncommenting the line below will cause a compilation error
            // System.out.println("Accessing: " + outerInstanceField); // Error
        }
    }
}


class StaticClassExample {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.printMessage();
    }
}
