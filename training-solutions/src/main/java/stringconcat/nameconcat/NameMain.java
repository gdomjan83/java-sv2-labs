package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name name1 = new Name("Jameson", "Jonah", "James", Title.MR);
        Name name2 = new Name("Domján", "Gábor", "Péter");

        System.out.println(name1.concatNameWesternStyle());
        System.out.println(name2.concatNameHungarianStyle());
    }
}
