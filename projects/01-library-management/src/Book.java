import exceptions.BookAlreadyAvailableException;

public class Book {

    private static int nextId = 1;

    private final int id;
    private final String title;
    private final String author;
    private final String genre;
    private boolean available;

    public Book(String title, String author, String genre, boolean available) {
        this.id = nextId++;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook() throws BookAlreadyAvailableException {
        if (available) {
            throw new BookAlreadyAvailableException(
                    "Book already available: " + title
            );
        }

        available = true;
        System.out.println("Book returned successfully.");
    }
}