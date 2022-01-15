package searching;

import java.util.Collections;
import java.util.List;

public class BookSearch {
    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if (!isValidString(author) || !isValidString(title)) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
        int index = Collections.binarySearch(books, new Book(0, author, title));
        if (index < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
        return books.get(index);
    }

    private boolean isValidString(String input) {
        if (input == null || input.isBlank()) {
            return false;
        }
        return true;
    }
}
