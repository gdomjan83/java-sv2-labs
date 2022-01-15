package searching;

public class Book implements Comparable<Book> {
    private int id;
    private String title;
    private String author;

    public Book(int id, String author, String title) {
        this.id = id;
        this.title = title;
        this.author = author;
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

    @Override
    public int compareTo(Book otherBook) {
        if (author.compareTo(otherBook.author) == 0) {
            return title.compareTo(otherBook.title);
        }
        return author.compareTo(otherBook.author);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", id, author, title);
    }

}
