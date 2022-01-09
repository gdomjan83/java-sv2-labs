package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {
    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, List<Feature> features) {
        Validators.isBlank(registrationNumber);
        Validators.isEmpty(features);
        this.features = features;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }


}
