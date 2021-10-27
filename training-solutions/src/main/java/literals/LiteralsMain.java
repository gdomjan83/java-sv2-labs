package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        //összefűzés
        System.out.println(1 + "" + 2);
        System.out.println(Integer.toString(1) + Integer.toString(2));

        //osztás
        double quotient = 3 / 4.0;
        System.out.println(quotient);

        //nagy szám
        long big = 3_244_444_444L;
        System.out.println(big);

        //String mint objektum
        String word = "title";
        System.out.println(word.toUpperCase());

        //szám bináris stringként
        int number = 1;
        System.out.println(Integer.toBinaryString(number));

        number = -2;
        System.out.println(Integer.toBinaryString(number));

    }
}
