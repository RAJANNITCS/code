package corejava;

public class EqualMethodAndEqualOperater {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;

        String s1 = new String("rohan");
        String s2 = new String("rohan");

        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
