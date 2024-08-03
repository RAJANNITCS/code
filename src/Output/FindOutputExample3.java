package Output;

public class FindOutputExample3 {
    public static void main(String[] args) {
        try {
            System.out.println("try block run");
            System.exit(1);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("run finally block");
        }
    }
}
