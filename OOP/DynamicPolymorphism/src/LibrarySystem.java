public class LibrarySystem {

    // Main method to demonstrate dynamic polymorphism
    public static void main(String[] args) {
        // Create an array of LibraryMember objects
        LibraryMember[] members = new LibraryMember[3];

        // Initialize the array with different types of members
        members[0] = new LibraryMember("Alex"); // Base class object
        members[1] = new StudentMember("Emily"); // Derived class object (StudentMember)
        members[2] = new ProfessorMember("Dr. Smith"); // Derived class object (ProfessorMember)

        // Iterate through the array and call borrowBook method for each member
        for (LibraryMember member : members) {
            member.borrowBook(); // Dynamic method dispatch in action
        }
    }
}