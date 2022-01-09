package catalog;

public final class SearchCriteria {
    private String contributor;
    private String title;

    public static SearchCriteria createByBoth(String title, String contributor) {
        testString(contributor);
        testString(title);
        return new SearchCriteria(title, contributor);
    }

    public static SearchCriteria createByContributor(String contributor) {
        testString(contributor);
        return new SearchCriteria(null, contributor);
    }

    public static SearchCriteria createByTitle(String title) {
        testString(title);
        return new SearchCriteria(title, null);
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasContributor() {
        return contributor != null;
    }

    public boolean hasTitle() {
        return title != null;
    }

    private SearchCriteria(String title, String contributor) {
        this.contributor = contributor;
        this.title = title;
    }

    private static void testString(String input) {
        if (Validators.isBlank(input)) {
            throw new IllegalArgumentException("Input is blank or null.");
        }
    }
}
