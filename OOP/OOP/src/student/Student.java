package student;

// Define a simple Student class with four attributes: name, roll number, age, and height
public class Student {
    String name;
    int rollNumber;
    int age;
    double height;

    // Constructor to initialize the Student object with name, roll number, age, and height
    public Student(String name, int rollNumber, int age, double height) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.height = height;
    }
}