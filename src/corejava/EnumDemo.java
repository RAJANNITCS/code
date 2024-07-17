package DeadlockExample;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumDemo {
    public static void main(String[] args) {
        Days d1 = Days.SUNDAY;
        switch(d1) {
            case SUNDAY:
                System.out.println("leave");
                break;
            case MONDAY:
                System.out.println("go to office");
                break;
            default:
                System.out.println("rest");
                break;
        }
    }
}
