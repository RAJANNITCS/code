package corejava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClassExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("info.properties")) {
            Properties newProperties = new Properties();
            newProperties.setProperty("name","rohan");
            newProperties.setProperty("email","rajan.nit.cs@gmail.com");

            newProperties.store(writer,"Java point");
        }catch (IOException e) {
            e.printStackTrace();
        }

        try(FileReader reader = new FileReader("info.properties")) {
            Properties properties = new Properties();
            properties.load(reader);

            String name = properties.getProperty("name");
            String email = properties.getProperty("email");

            System.out.println("name ="+name);
            System.out.println("email="+email);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
