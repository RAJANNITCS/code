package corejava;

import java.io.BufferedReader;
import java.io.FileOutputStream;

public class TryWithResource {
    // try with single resource
    public static void main(String[] args) {
        try (FileOutputStream obj_1 = new FileOutputStream("output.txt")) {
            String s1 = "this is try with resource";
			byte arr[] = s1.getBytes();
			obj_1.write(arr);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
