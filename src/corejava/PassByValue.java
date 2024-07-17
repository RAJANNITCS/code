package corejava;

public class PassByValue {
    public static void main(String[] args) {
        Integer value = 10;
        Person11 p1 = new Person11(28,"rohan");
        changeValue(value,p1);
        reassignPerson(p1);
        System.out.println(value);
        p1.display();
    }

    private static void changeValue(Integer value,Person11 p1) {
        value = 30;
        p1.name = "ram";
    }

    private static void reassignPerson(Person11 p1) {
        p1 = new Person11(30,"ravi");
        p1.name = "mohan";
    }
}
