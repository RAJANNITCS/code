package DeadlockExample;

class Bike2 {
    public Integer startSpeed = 10;
    public Integer topSpeed = 150;

//    public Bike2(Integer startSpeed,Integer topSpeed) {
//        this.startSpeed = startSpeed;
//        this.topSpeed = topSpeed;
//    }
//
//    public void display() {
//        System.out.println(this.startSpeed+" "+this.topSpeed);
//    }

}

class SuperBike extends Bike2 {
    public String bikeName;
    public Integer startSpeed;
    public Integer topSpeed;

    public SuperBike(Integer startSpeed,Integer topSpeed,String nameOfBike) {
//        super(startSpeed,topSpeed);
        this.bikeName = nameOfBike;
        this.startSpeed = startSpeed;
        this.topSpeed = topSpeed;
    }

    public void display() {
//        super.display();
        System.out.println(super.startSpeed+" "+this.topSpeed);
        System.out.println(this.bikeName);
    }

}

public class SuperKeywordsExample {
    public static void main(String[] args) {
        SuperBike s1 = new SuperBike(100,150,"KTM");
        s1.display();
    }
}
