package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {
    private String title;
    private List<String> authors = new ArrayList<>();
    private int numberOfPages;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        testTitle(title);
        testList(authors);
        testNumberOfPages(numberOfPages);
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

    private void testTitle(String input) {
        if (Validators.isBlank(input)) {
            throw new IllegalArgumentException("Empty title");
        }
    }

    private void testList(List input) {
        if (Validators.isEmpty(input)) {
            throw new IllegalArgumentException("Input list is blank or null.");
        }
    }

    private void testNumberOfPages(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Length must be at least one.");
        }
    }
}
