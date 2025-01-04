package ManagingSerialization;

import java.io.Serializable;

public class Employee implements Serializable {

    // serialVersionUID ensures consistent serialization
    private static final long serialVersionUID = 1L;

    private String name;
    private String department;

    // Password is sensitive information, hence marked as transient
    private transient String password;

    public Employee(String name, String department, String password) {
        this.name = name;
        this.department = department;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", password='" + (password != null ? password : "null") + '\'' + // Display "null" for transient field
                '}';
    }
}
