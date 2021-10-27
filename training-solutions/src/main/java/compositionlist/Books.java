package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> titles = new ArrayList<>();

    public List<String> getTitles() {
        return titles;
    }

    public void addBook(String title){
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).equals(title)) {
                String titleAuthor = author  + ": " + titles.get(i);
                titles.set(i, titleAuthor);
            }
        }
    }
}
