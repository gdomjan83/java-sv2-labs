package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Domján Gábor", "KE11121");

        person.moveToAddress(new Address("Belgium", "Brüsszel", "Larian st. 45", "B4845"));

        System.out.println(person.personToString());;
        System.out.println(person.getAddress().addressToString());

        person.getAddress().correctData("Hungary", "Veszprém", "Kiss utca 11", "8200");
        System.out.println(person.getAddress().addressToString());
    }
}
