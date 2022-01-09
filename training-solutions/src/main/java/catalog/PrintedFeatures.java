package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {
    private String title;
    private List<String> authors = new ArrayList<>();
    private int numberOfPages;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        Validators.isBlank(title);
        Validators.isEmpty(authors);
        this.title = title;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public List<String> getContributors() {
        return new ArrayList<>(authors);
    }

    @Override
    public String getTitle() {
        return title;
    }
}
