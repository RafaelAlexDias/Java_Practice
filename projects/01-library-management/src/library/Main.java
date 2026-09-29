package library;

import exceptions.BookAlreadyAvailableException;
import exceptions.BookNotFoundException;

import java.util.List;

/**
 * Library Management demo.
 *
 * Walks through the main features: add books, search by author, borrow/return
 * (including the exception path) and statistics via LibraryStatistics.
 */
public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(
                "The Hobbit",
                "J.R.R. Tolkien",
                "Fantasy",
                true
        );

        Book book2 = new Book(
                "Dune",
                "Frank Herbert",
                "Science Fiction",
                true
        );

        library.addBook(book1);
        library.addBook(book2);

        List<Book> books =
                library.searchByAuthor("J.R.R. Tolkien");

        books.forEach(book ->
                System.out.println(book.getTitle())
        );

        try {
            // The second borrow of "Dune" only prints "already borrowed"
            // (borrow() is lenient); returning an available book throws,
            // which is why the second return is caught below.
            library.borrowBook("Dune");
            library.borrowBook("Dune");

            library.returnBook("Dune");
            library.returnBook("Dune");

        } catch (BookNotFoundException |
                 BookAlreadyAvailableException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }

        LibraryStatistics statistics = new LibraryStatistics();

        System.out.println(statistics.getTotalBooks(library));
        System.out.println(statistics.getAvailableBooks(library));
        System.out.println(statistics.getBorrowedBooks(library));
        System.out.println(statistics.getBooksByGenre(library));
        System.out.println(statistics.getBooksByAuthor(library));

    }
}