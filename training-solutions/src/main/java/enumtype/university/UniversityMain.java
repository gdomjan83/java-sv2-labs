package enumtype.university;

public class UniversityMain {
    public static void main(String[] args) {
        System.out.println(University.valueOf("BME").name);
        System.out.println(University.valueOf("PE").name);
        System.out.println(University.valueOf("DE").name);
        System.out.println(University.valueOf("MATE").name);
    }
}
