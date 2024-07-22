package corejava;

public class CreateThreadUsingLambdExpration {
    public static void main(String[] args) {
        Resource1 resource1 = new Resource1();

        Thread run = new Thread(() -> {
            resource1.method1("hello");
        },"Thread-1");

        run.start();
    }
}

class Resource1 {
    public void method1(String s1) {
        System.out.println(s1);
        System.out.println(Thread.currentThread().getName());
    }
}
