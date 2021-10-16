package classstructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ki a könyv írója?");
        String author = scanner.nextLine();
        System.out.println("Mi a könyv címe?");
        String title = scanner. nextLine();

        Book book = new Book(author, title);

        System.out.println("A kért könyv:");
        System.out.println(book.getAuthor() + ": " + book.getTitle());

        System.out.println("Add meg a könyv regisztrációs számát!");
        String regNumber = scanner.nextLine();
        book.register(regNumber);

        System.out.println("A könyv adatai:");
        System.out.println(book.getAuthor() + ": " + book.getTitle() + " (" + book.getRegNumber() + ")");
    }
}
