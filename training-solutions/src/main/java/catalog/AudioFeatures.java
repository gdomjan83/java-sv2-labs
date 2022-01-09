package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
    private List<String> composer = new ArrayList<>();
    private int length;
    private List<String> performers = new ArrayList<>();
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        testString(title);
        testList(performers);
        testLength(length);
        this.title = title;
        this.length = length;
        this.performers = performers;
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        testString(title);
        testList(performers);
        testList(composer);
        testLength(length);
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composer = composer;
    }

    public int getLength() {
        return length;
    }

    @Override
    public List<String> getContributors() {
        List<String> result = new ArrayList<>(composer);
        for (String p : performers) {
            result.add(p);
        }
        return result;
    }

    @Override
    public String getTitle() {
        return title;
    }

    private void testString(String input) {
        if (Validators.isBlank(input)) {
            throw new IllegalArgumentException("Input is blank or null.");
        }
    }

    private void testList(List input) {
        if (Validators.isEmpty(input)) {
            throw new IllegalArgumentException("Input list is blank or null.");
        }
    }

    private void testLength(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Length must be at least one.");
        }
    }


}
