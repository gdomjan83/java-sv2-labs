package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooksTest {

    Books books = new Books();

    @TempDir
    File tempDir;

    @Test
    public void testBooks() throws IOException {
        Path path = tempDir.toPath().resolve("books.txt");
        System.out.println(path);
        books.readFile(Paths.get("src/test/resources/books.txt"));
        books.convertToNewFormat();
        books.writeFile(path);

        List<String> result = Arrays.asList(
                "Gárdonyi Géza: Egri csillagok",
                "Molnár Ferenc: Pál utcai fiúk",
                "Fekete István: Tüskevár",
                "Jókai Mór: Kőszívű ember fiai"
        );
        List<String> writtenLines = Files.readAllLines(path);
        assertEquals(result, writtenLines);
    }
}
