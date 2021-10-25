package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");

        System.out.println(book.getTitle());
        book.setTitle("Foundation");
        System.out.println(book.getTitle());
    }
}
