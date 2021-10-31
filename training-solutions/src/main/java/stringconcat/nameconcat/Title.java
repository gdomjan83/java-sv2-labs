package stringconcat.nameconcat;

public enum Title {
    MR("Mr."), MRS("Mrs."), MS("Ms."), DR("Dr.");

    public final String shortTitle;

    Title(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getShortTitle() {
        return shortTitle;
    }
}
