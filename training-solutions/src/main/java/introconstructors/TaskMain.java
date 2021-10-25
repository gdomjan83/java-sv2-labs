package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Java", "Java tananyag feldolgozása.");

        task.setDuration(120);;
        task.start();
        System.out.println("Feladat: " + task.getTitle());
        System.out.println("Feladat leírása: " + task.getDescription());
        System.out.println("Tanulás ideje: " + task.getDuration() + " perc");
        System.out.println("Tanulás kezdete: " + task.getStartDateTime());
    }
}
