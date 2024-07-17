package DeadlockExample;

class Heart {
    private Integer size;
    private String color;

    public Heart(Integer size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.size + " " + this.color;
    }
}

class Human {
    private String name;
    private Integer age;
    private Heart heart;

    public Human(String name, Integer age, Heart heart) {
        this.name = name;
        this.age = age;
        this.heart = heart;
    }

    public void display() {
        System.out.println(this.name + " " + this.age + " -> " + this.heart.toString());
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Heart heart = new Heart(20, "red");
        Human ram = new Human("Ram", 25, heart);
        ram.display();
    }
}
