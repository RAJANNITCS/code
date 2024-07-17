package corejava;

import java.util.Scanner;

class YoungerAgeExceptions extends RuntimeException {
    public YoungerAgeExceptions(String msg) {
        super(msg);
    }
}

public class Voting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = s.nextInt();

        try {
            if (age < 18) {
                throw new YoungerAgeExceptions("You are not eligible for voting");
            } else {
                System.out.println("You can vote");
            }
        }catch (YoungerAgeExceptions e) {
            e.printStackTrace();
        }

        System.out.println("Hello");
        s.close();
    }
}
