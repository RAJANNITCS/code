package DeadlockExample;

class CompileTimePolymorphism {
    void display(int a) {
        System.out.println("Argument: " + a);
    }

    void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        obj.display(1);
        obj.display(1, 2);
    }
}
