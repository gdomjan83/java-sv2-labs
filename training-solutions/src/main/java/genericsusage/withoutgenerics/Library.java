package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.List;
public class Library {
    public Book getFirstBook(List books) {
        if (books == null) {
            throw new NullPointerException("Argument should not be null!");
        }
        if (books.size() == 0) {
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        Object first = books.get(0);
        if (! (first instanceof Book)) {
            throw new ClassCastException("Not a book");
        }
        return (Book) first;
    }
}
