package DeadlockExample;

public class InfiniteLoop {
    public static void main(String[] args) {

//        for(int i = 0;;i++) {
//            System.out.println(i);
//        }

        Integer i = 0;
//        while (true) {
//            System.out.println(i);
//            i += 1;
//        }

        do {
            System.out.println(i++);
        }while(true);
    }
}
