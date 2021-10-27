package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Zalalövő", "8999", "Kossuth Lajos utca", 10);

        Details details = new Details("Tuti kéró, alig lelakott.", address, 15, 50);

        RealEstate estate = new RealEstate("Putri eladó!", 12_000_000, details);

        System.out.println(estate.toString());
        System.out.println();
        System.out.println(estate.getDetails().getAddress().toString());

    }
}
