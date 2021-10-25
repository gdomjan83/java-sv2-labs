package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1;
        Person person2;

        person1 = new Person("Domján Gábor", 37);
        person2 = person1;

        person2.setName("Keller Tamás");

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        int number1 = 24;
        int number2 = number1;

        number2++;

        System.out.println(number1);
        System.out.println(number2);

        person1 = new Person("Zaránd Alina", 26);
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
