package objectclass.simplebag;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;
        if (author.equals(book.author) && title.equals(book.title)) {
            return true;
        }
        return false;
    }
}
