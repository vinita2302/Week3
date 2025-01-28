package Main.doubly_linked_list.library_management_system;


class LibraryManagementSystem {
    private Book head;
    private Book tail;
    private int totalBooks;

    public LibraryManagementSystem() {
        this.head = null;
        this.tail = null;
        this.totalBooks = 0;
    }

    // Add a book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        totalBooks++;
    }

    // Add a book at the end
    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        totalBooks++;
    }

    // Add a book at a specific position
    public void addBookAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (position <= 0) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
        } else if (position >= totalBooks) {
            addBookAtEnd(title, author, genre, bookId, isAvailable);
        } else {
            Book newBook = new Book(title, author, genre, bookId, isAvailable);
            Book temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newBook.next = temp.next;
            newBook.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newBook;
            }
            temp.next = newBook;
            totalBooks++;
        }
    }

    // Remove a book by Book ID
    public void removeBookById(int bookId) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Book temp = head;

        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book with ID " + bookId + " not found.");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        totalBooks--;
        System.out.println("Book with ID " + bookId + " removed.");
    }

    // Search for a book by title
    public void searchBookByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + tempDetails(temp));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with title \"" + title + "\" not found.");
    }

    // Search for a book by author
    public void searchBookByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                System.out.println("Book Found: " + tempDetails(temp));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book by author \"" + author + "\" not found.");
    }

    // Update a book's availability status
    public void updateAvailabilityStatus(int bookId, boolean isAvailable) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                System.out.println("Availability status of Book ID " + bookId + " updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Display all books in forward order
    public void displayBooksForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        Book temp = head;
        while (temp != null) {
            System.out.println(tempDetails(temp));
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }
        Book temp = tail;
        while (temp != null) {
            System.out.println(tempDetails(temp));
            temp = temp.prev;
        }
    }

    // Count total number of books
    public void countTotalBooks() {
        System.out.println("Total number of books: " + totalBooks);
    }

    // Helper to get book details
    private String tempDetails(Book book) {
        return "ID: " + book.bookId + ", Title: " + book.title + ", Author: " + book.author +
                ", Genre: " + book.genre + ", Available: " + book.isAvailable;
    }
}