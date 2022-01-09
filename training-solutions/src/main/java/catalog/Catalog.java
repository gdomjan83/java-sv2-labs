package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int minPageNumber) {
        List<Integer> pageNumbers = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            getPageNumbers(c, minPageNumber, pageNumbers);
        }

        return (double) (sumPageNumbers(pageNumbers) / pageNumbers.size());
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        Validators.isBlank(registrationNumber);
        List<CatalogItem> itemsToRemove = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            if (registrationNumber.equals(c.getRegistrationNumber())) {
                itemsToRemove.add(c);
            }
        }
        catalogItems.removeAll(itemsToRemove);
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            searchFeatures(c, result, searchCriteria);
        }
        return result;
    }

    private void searchFeatures(CatalogItem catalogItem, List<CatalogItem> result, SearchCriteria searchCriteria) {
        for (Feature f : catalogItem.getFeatures()) {
            searchTitleAndContributor(catalogItem, f, result, searchCriteria);
        }
    }

    private void searchTitleAndContributor(CatalogItem catalogItem, Feature feature, List<CatalogItem> result, SearchCriteria searchCriteria) {
        if (searchCriteria.hasContributor() && searchCriteria.hasTitle()) {
            if (searchCriteria.getTitle().equals(feature.getTitle()) && feature.getContributors().contains(searchCriteria.getContributor())) {
                addCatalogItemToList(catalogItem, result);
            }
        } else if (searchCriteria.hasTitle()) {
            if (searchCriteria.getTitle().equals(feature.getTitle())) {
                addCatalogItemToList(catalogItem, result);
            }
        } else if (searchCriteria.hasContributor()) {
            if (feature.getContributors().contains(searchCriteria.getContributor())) {
                addCatalogItemToList(catalogItem, result);
            }
        }
    }

    private void addCatalogItemToList(CatalogItem catalogItem, List<CatalogItem> result) {
        if (!result.contains(catalogItem)) {
            result.add(catalogItem);
        }
    }

    public int getAllPageNumber() {
        int sum = 0;
        for (CatalogItem c : catalogItems) {
            sum += c.numberOfPagesAtOneItem();
        }
        return sum;
    }

    public int getFullLength() {
        int sum = 0;
        for (CatalogItem c : catalogItems) {
            sum += c.fullLengthAtOneItem();
        }
        return sum;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            if (c.hasAudioFeature()) {
                result.add(c);
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            if (c.hasPrintedFeature()) {
                result.add(c);
            }
        }
        return result;
    }

    private void getPageNumbers(CatalogItem catalogItem, int minPageNumber, List<Integer> pageNumbers) {
        for (Feature f : catalogItem.getFeatures()) {
            if (f instanceof PrintedFeatures && ((PrintedFeatures) f).getNumberOfPages() > minPageNumber) {
                pageNumbers.add(((PrintedFeatures) f).getNumberOfPages());
            }
        }
    }

    private int sumPageNumbers(List<Integer> pageNumbers) {
        int sum = 0;
        for (Integer i : pageNumbers) {
            sum += i;
        }
        return sum;
    }
}
