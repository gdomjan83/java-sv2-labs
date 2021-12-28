package interfacedependencyinversion.vaccine;

public class Person {
    private String name;
    private int age;
    private Pregnancy pregnant;
    private ChronicDisease chronic;

    public Person(String name, int age, ChronicDisease chronic, Pregnancy pregnant) {
        this.name = name;
        this.age = age;
        this.pregnant = pregnant;
        this.chronic = chronic;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Pregnancy getPregnant() {
        return pregnant;
    }

    public ChronicDisease getChronic() {
        return chronic;
    }
}
