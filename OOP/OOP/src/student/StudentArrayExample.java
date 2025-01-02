package student;

import java.util.Scanner;

public class StudentArrayExample {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of students
        System.out.print("How many students do you want to enter? ");
        int numStudents = scanner.nextInt();

        // Create an array of Student objects with the size provided by the user
        Student[] students = new Student[numStudents];

        // Loop to take input for each student and store it in the array
        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); // Consume newline

            // Taking input for the name, roll number, age, and height of the student
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Height (in cm): ");
            double height = scanner.nextDouble();

            // Create a new Student object with the provided details
            students[i] = new Student(name, rollNumber, age, height);
        }

        // Compute and display statistics
        calculateAndDisplayStatistics(students);
    }

    // Method to calculate and display various statistics based on the student array
    public static void calculateAndDisplayStatistics(Student[] students) {
        int totalAge = 0;
        double totalHeight = 0.0;
        int oldestAge = students[0].age;
        double tallestHeight = students[0].height;
        String oldestStudent = students[0].name;
        String tallestStudent = students[0].name;

        for (Student student : students) {
            totalAge += student.age;
            totalHeight += student.height;

            if (student.age > oldestAge) {
                oldestAge = student.age;
                oldestStudent = student.name;
            }

            if (student.height > tallestHeight) {
                tallestHeight = student.height;
                tallestStudent = student.name;
            }
        }

        double averageAge = (double) totalAge / students.length;
        double averageHeight = totalHeight / students.length;

        System.out.println("\n--- Statistics ---");
        System.out.println("Average Age: " + averageAge + " years");
        System.out.println("Average Height: " + averageHeight + " cm");
        System.out.println("Oldest Student: " + oldestStudent + " (Age: " + oldestAge + " years)");
        System.out.println("Tallest Student: " + tallestStudent + " (Height: " + tallestHeight + " cm)");
    }
}