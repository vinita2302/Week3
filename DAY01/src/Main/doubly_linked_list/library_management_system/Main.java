package Main.doubly_linked_list.library_management_system;



public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Add books
        library.addBookAtBeginning("Book A", "Author X", "Fiction", 1, true);
        library.addBookAtEnd("Book B", "Author Y", "Non-Fiction", 2, false);
        library.addBookAtPosition(1, "Book C", "Author Z", "Science", 3, true);

        // Display books
        System.out.println("Books in forward order:");
        library.displayBooksForward();

        System.out.println("Books in reverse order:");
        library.displayBooksReverse();

        // Search books
        library.searchBookByTitle("Book A");
        library.searchBookByAuthor("Author Z");

        // Update availability
        library.updateAvailabilityStatus(2, true);

        // Remove a book
        library.removeBookById(1);

        // Display books after removal
        System.out.println("Books after removal:");
        library.displayBooksForward();

        // Count total books
        library.countTotalBooks();
    }
}
