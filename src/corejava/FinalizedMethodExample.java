package DeadlockExample;

public class FinalizedMethodExample {
    public static void main(String[] args) {
        FinalizedMethodExample obj_01 = new FinalizedMethodExample();
        FinalizedMethodExample obj_02 = new FinalizedMethodExample();

        obj_01 = null;
        obj_02 = null;

        System.gc();
    }

    @Override
    protected void finalize() {
        System.out.println("run finalize method");
    }
}
