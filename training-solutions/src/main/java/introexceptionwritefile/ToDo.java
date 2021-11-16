package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    private List<String> stuffToDo = new ArrayList<>();

    public List<String> getStuffToDo() {
        return stuffToDo;
    }

    public void addToList(String toDo) {
        stuffToDo.add(toDo);
    }

    public void writeList(Path path) {
        try {
            Files.write(path, stuffToDo);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file.", ioe);
        }
    }

    public static void main(String[] args) {
        ToDo toDo = new ToDo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add meg a következő teendőt. A rögzítést az X karakterrel tudod befejezni.");
        String line;

        while (!(line = sc.nextLine()).equalsIgnoreCase("x")) {
            toDo.addToList(line);
        }
        toDo.writeList(Paths.get("src/main/resources/todos.txt"));
        System.out.println("Lista rögzítve.");
    }
}
