package linebreak;

public class CityNames {
    public static void main(String[] args) {
        System.out.print("Zalalövő\nVeszprém\nBudapest");
        System.out.println();
        //Másik módszerrel
        System.out.print("Zalalövő" + System.lineSeparator() + "Veszprém" + System.lineSeparator() + "Budapest");
    }
}
