package corejava;

public class FinalllyBlock {
    public static void main(String[] ages) {
        try {
            int[] arr = new int[5];
            arr[4] = 33/0;
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally block always execute");
        }
    }
}
