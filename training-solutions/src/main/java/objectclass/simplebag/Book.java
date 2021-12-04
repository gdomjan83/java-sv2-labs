package objectclass.simplebag;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
