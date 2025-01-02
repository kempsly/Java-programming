// Base class representing a Library Member
class LibraryMember {
    String name;

    // Constructor for LibraryMember
    public LibraryMember(String name) {
        this.name = name;
    }

    // Method to borrow books (overridden in subclasses)
    public void borrowBook() {
        System.out.println(name + " can borrow books.");
    }
}