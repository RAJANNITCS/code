package DeadlockExample;

class Bike4 {
    public int startSpeed;
    public int topSpeed;

    // Default constructor
    public Bike4() {
        this.startSpeed = 0;
        this.topSpeed = 120;
    }

    // Parameterized constructor
    public Bike4(int startSpeed, int topSpeed) {
        this.startSpeed = startSpeed;
        this.topSpeed = topSpeed;
    }

    public void display() {
        System.out.println("Start Speed: " + this.startSpeed + " Top Speed: " + this.topSpeed);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Using default constructor
        Bike4 normalBike = new Bike4();
        normalBike.display();

        // Using parameterized constructor
        Bike4 superBike = new Bike4(0, 180);
        superBike.display();
    }
}

