package corejava;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CreateThreadUsingCallable implements Callable<String> {

    @Override
    public String call() {
        return  "retrun call method";
    }

    public static void main(String[] args) {
        CreateThreadUsingCallable obj = new CreateThreadUsingCallable();
        try {
            FutureTask<String> f1 = new FutureTask<>(obj);
            Thread t1 = new Thread(f1);
            t1.start();
            System.out.println(f1.get());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
