package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("Csány László KSZKI", 4);
        School prSchool = new PrimarySchool("Zalalövői Általános Iskola", 8);
        School secSchool = new SecondarySchool("Zrinyi Miklós Gimnázium", 4);

        System.out.println(school);
        System.out.println(prSchool);
        System.out.println(secSchool);
    }
}
