package catalog;

public final class SearchCriteria {
    private String contributor;
    private String title;

    public static SearchCriteria createByBoth(String contributor, String title) {
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor(String contributor) {
        return new SearchCriteria(contributor, null);
    }

    public static SearchCriteria createByTitle(String title) {
        return new SearchCriteria(null, title);
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

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }


}
