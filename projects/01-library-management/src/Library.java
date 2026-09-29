import exceptions.BookAlreadyAvailableException;
import exceptions.BookNotFoundException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {

    private final List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                bookList.remove(i);
                System.out.println("Book removed successfully!");
                return;
            }
        }

        System.out.println("That book is not in the library.");
    }

    public Book findBook(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }

        return null;
    }

    public void listBooks() {
        for (Book book : bookList) {
            System.out.println(
                    book.getTitle()
                            + " is available? "
                            + book.isAvailable()
            );
        }
    }

    public void borrowBook(String title) throws BookNotFoundException {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                book.borrow();
                return;
            }
        }

        throw new BookNotFoundException(
                "Book not found: " + title
        );
    }

    public void returnBook(String title)
            throws BookNotFoundException, BookAlreadyAvailableException {

        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                book.returnBook();
                return;
            }
        }

        throw new BookNotFoundException(
                "Book not found: " + title
        );
    }

    public List<Book> searchByAuthor(String author) {
        return bookList.stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();
    }

    public List<Book> filterByGenre(String genre) {
        return bookList.stream()
                .filter(book -> book.getGenre().equals(genre))
                .toList();
    }

    public void sortBooks() {
        bookList.sort(
                Comparator.comparing(Book::getTitle)
        );
    }

    public List<Book> getBooks() {
        return List.copyOf(bookList);
    }
}