package DeadlockExample;

enum Color {
    RED, GREEN, BLUE;
}


public class CanCreateEnumInstance {
    public static void main(String[] args) {
        // Creating an instance of the enum using one of its predefined values
        Color myColor = Color.RED;

        // Using the enum instance
        switch (myColor) {
            case RED:
                System.out.println("Selected color is red.");
                break;
            case GREEN:
                System.out.println("Selected color is green.");
                break;
            case BLUE:
                System.out.println("Selected color is blue.");
                break;
            default:
                System.out.println("Unknown color.");
        }
    }
}
