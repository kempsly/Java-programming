// Subclass representing a Professor Member
class ProfessorMember extends LibraryMember {

    // Constructor for ProfessorMember
    public ProfessorMember(String name) {
        super(name); // Call the constructor of the base class
    }

    // Overriding the borrowBook method for ProfessorMember
    @Override
    public void borrowBook() {
        System.out.println(name + " can borrow up to 10 books.");
    }
}