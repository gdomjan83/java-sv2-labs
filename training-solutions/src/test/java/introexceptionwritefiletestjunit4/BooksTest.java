package introexceptionwritefiletestjunit4;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BooksTest {
    Books books = new Books();

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    @Test
    public void testBooks() throws IOException {
        Path path = temp.newFile("book_list.txt").toPath();
        System.out.println(path);

        books.readFile(Paths.get("src/test/resources/books.txt"));
        books.convertToNewFormat();
        books.writeFile(path);

        List<String> writtenLines = Files.readAllLines(path);
        List<String> result = Arrays.asList(
                "Gárdonyi Géza: Egri csillagok",
                "Molnár Ferenc: Pál utcai fiúk",
                "Fekete István: Tüskevár",
                "Jókai Mór: Kőszívű ember fiai"
        );
        assertEquals(result, writtenLines);
    }
}
