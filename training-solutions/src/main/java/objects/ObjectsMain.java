package objects;

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
    }
}
