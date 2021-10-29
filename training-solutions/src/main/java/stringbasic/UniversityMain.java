package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        Person person1 = new Person("Domján Gábor", "gdomj@gmail.com", "4854844",
                "12345678-87654321", "06305554563");

        Person person2 = new Person("Kandó Kata", "katak@freemail.hu", "88866644",
                "12312345-89874563", "06205557788");

        Student student1 = new Student(person1, "ZK4455", "846988");

        Student student2 = new Student(person2, "AZ895611", "965412");

        Student student3 = new Student(person2, "AZ895611", "965412");

        University university = new University();

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        System.out.println(university.areEqual(university.getStudents().get(0), university.getStudents().get(1)));
        System.out.println(university.areEqual(university.getStudents().get(1), university.getStudents().get(2)));
    }
}
