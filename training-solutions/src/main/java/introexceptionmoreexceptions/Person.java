package introexceptionmoreexceptions;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return String.format("Név: %s, életkor: %d év.", name, age);
    }

    public static void main(String[] args) {
        Person person = new Person(null, 32);

        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getName().toUpperCase()); //NullpointerException keletkezik, mert null referenciájú változón akarunk metódust hívni
    }
}
