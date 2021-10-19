package packages.namemain;

import packages.firstname.FirstName;
import packages.prefix.*;

public class NameMain {
    public static void main(String[] args) {

        Prefix prefix = new Prefix("Dr.");
        FirstName firstName = new FirstName("Gábor");
        packages.lastname.LastName lastName = new packages.lastname.LastName("Domján");

        System.out.println(prefix.getPre() + " " + firstName.getFirst() + " " + lastName.getLast());
    }
}
