package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
    private List<String> composer = new ArrayList<>();
    private int length;
    private List<String> performers = new ArrayList<>();
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        Validators.isBlank(title);
        Validators.isEmpty(performers);
        this.title = title;
        this.length = length;
        this.performers = performers;
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        Validators.isBlank(title);
        Validators.isEmpty(performers);
        Validators.isEmpty(composer);
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
}
