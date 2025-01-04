package ManagingSerialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("John Doe", "Engineering", "password123");

        // Serialize the object to a file
        try (FileOutputStream fileOut = new FileOutputStream("employee.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(employee);
            System.out.println("Serialized data is saved in employee.ser");

        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
