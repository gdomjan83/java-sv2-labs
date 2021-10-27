package compositionlist;

import java.util.Scanner;

public class BooksMain {
    public static void main(String[] args) {
        Books books = new Books();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hány könyvet szeretnél felvinni az adatbázisba?");
        int bookNumber = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < bookNumber; i++) {
            System.out.println((i + 1) + ". könyv címe:");
            String title = sc.nextLine();
            books.addBook(title);
        }

        System.out.println("Az adatbázis tartalma:");
        System.out.println(books.getTitles());

        System.out.println("Melyik könyvhöz szeretnéd rögzíteni az írót?");
        String title = sc.nextLine();
        System.out.println("Ki az író?");
        String author = sc.nextLine();
        books.findBookAndSetAuthor(title, author);

        System.out.println("Az adatbázis tartalma:");
        System.out.println(books.getTitles());
    }
}
