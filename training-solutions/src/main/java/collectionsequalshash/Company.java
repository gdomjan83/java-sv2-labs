package collectionsequalshash;

import java.util.Objects;

public class Company {
    private String name;
    private String taxID;

    public Company(String name, String taxID) {
        this.name = name;
        this.taxID = taxID;
    }

    public String getName() {
        return name;
    }

    public String getTaxID() {
        return taxID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Company company = (Company) o;
        return (name.equals(company.getName()) && taxID.equals(company.getTaxID()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, taxID);
    }
}
