package stringseparate;

import java.util.Arrays;
import java.util.List;

public class IceCream {
    private List<String> flavours = Arrays.asList("csoki", "vanilia", "citrom", "punch", "eper", "karamell");

    public List<String> getFlavours() {
        return flavours;
    }
//Megoldás több változatban:
//    public StringBuilder writeOffer(List<String> flavours) {
//        StringBuilder offer = new StringBuilder("Mai ajánlat: ");
//
//        for (int i = 0; i < flavours.size(); i++) {
//            offer.append(flavours.get(i));
//            if (i != flavours.size() - 1) {
//                offer.append(", ");
//            }
//        }
//        offer.append(". Laktózmentes változatok is elérhetők.");
//        return offer;
//    }

//    public StringBuilder writeOffer(List<String> flavours) {
//        StringBuilder offer = new StringBuilder("Mai ajánlat: ");
//
//        for (int i = 0; i < flavours.size(); i++) {
//            if (i != 0) {
//                offer.append(", ");
//            }
//            offer.append(flavours.get(i));
//        }
//        offer.append(". Laktózmentes változatok is elérhetők.");
//        return offer;
//    }

    public StringBuilder writeOffer(List<String> flavours) {
        StringBuilder offer = new StringBuilder("Mai ajánlat: ");
        boolean first = true;
        for (String flavour: flavours) {
            if (first) {
                first = false;
            } else {
                offer.append(", ");
            }
            offer.append(flavour);
        }
        offer.append(". Laktózmentes változatok is elérhetők.");
        return offer;
    }


    public static void main(String[] args) {
        IceCream iceCream = new IceCream();

        System.out.println(iceCream.writeOffer(iceCream.getFlavours()));
    }
}
