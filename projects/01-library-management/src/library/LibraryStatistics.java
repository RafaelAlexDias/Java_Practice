package library;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Read-only statistics over a Library, built with the Stream API:
 * counts (total/available/borrowed) and grouping (by genre and by author).
 */
public class LibraryStatistics {

    public long getTotalBooks(Library library) {
        return library.getBooks().stream()
                .count();
    }

    public long getAvailableBooks(Library library) {
        return library.getBooks().stream()
                .filter(Book::isAvailable)
                .count();
    }

    public long getBorrowedBooks(Library library) {
        return library.getBooks().stream()
                .filter(book -> !book.isAvailable())
                .count();
    }

    public Map<String, List<Book>> getBooksByGenre(Library library) {
        return library.getBooks().stream()
                .collect(Collectors.groupingBy(Book::getGenre));
    }

    public Map<String, List<Book>> getBooksByAuthor(Library library) {
        return library.getBooks().stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
    }
}