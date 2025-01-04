package ManagingSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        Employee employee = null;

        // Deserialize the object from a file
        try (FileInputStream fileIn = new FileInputStream("employee.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            employee = (Employee) in.readObject();

        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }

        // Display the state of the deserialized object
        System.out.println("Deserialized Employee...");
        System.out.println(employee);
    }
}
