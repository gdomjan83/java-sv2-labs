package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();

        companies.add(new Company("Larian", "1234"));
        companies.add(new Company("Obsidian", "456"));
        companies.add(new Company("Blizzard", "7890"));

        System.out.println(companies.contains(new Company("Larian", "1234")));
        System.out.println(companies.contains(new Company("Obsidian", "456")));
        System.out.println(companies.contains(new Company("Blizzard", "7890")));
    }
}
