import java.util.ArrayList;

class Library {
    ArrayList<String> books = new ArrayList<>();

    void addBook(String book) {
        books.add(book);
        System.out.println(book + " added to the library.");
    }

    void removeBook(String book) {
        if (books.remove(book)) {
            System.out.println(book + " removed from the library.");
        } else {
            System.out.println(book + " is not available.");
        }
    }

    void displayBooks() {
        System.out.println("\nBooks in Library:");

        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (String book : books) {
                System.out.println(book);
            }
        }
    }

    public static void main(String args[]) {
        Library library = new Library();

        library.addBook("Java Programming");
        library.addBook("C++ Programming");
        library.addBook("Python Programming");

        library.displayBooks();

        library.removeBook("Python Programming");

        library.displayBooks();
    }
}