package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        new Book(); //később nem hozzáférhető, mert nem rendeltük változóhoz
        System.out.println(new Book()); //az objektum referencia hivatkozását írja ki
        Book emptyBook = null;
        System.out.println(emptyBook);
        System.out.println(emptyBook == null);
        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);
        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(book == anotherBook);
        System.out.println();

        System.out.println("Tömbök és listák feladat:");
        Book[] books = {new Book(), new Book(), new Book()};
        List<Book> listOfBooks = Arrays.asList(new Book(), new Book(), new Book());
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book());
        bookList.add(new Book());
        bookList.add(new Book());
        System.out.println(Arrays.toString(books));
        System.out.println(listOfBooks);
        System.out.println(bookList);


    }
}
